/*
 * Copyright 2022 GradleBuildPlugins
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.keronei.weatherapp.domain

import com.keronei.weatherapp.data.model.CityObjEntity
import com.keronei.weatherapp.data.model.CityWithForecast
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf

class FakeCitiesRepositoryImpl : CitiesRepository {

    private val citiesStore = mutableListOf<CityObjEntity>()

    private val citiesStoreWithForecast = mutableListOf<CityWithForecast>()

    override suspend fun addCity(cityObjEntity: CityObjEntity): Long {
        citiesStore.add(cityObjEntity)
        return citiesStore.indexOf(cityObjEntity).toLong()
    }

    override fun queryAllCities(): Flow<List<CityWithForecast>> = flowOf(citiesStoreWithForecast)

    override fun queryLimitedCitiesCount(
        count: Int,
        country: String
    ): Flow<List<CityWithForecast>> {
        return flowOf(
            citiesStoreWithForecast.filter { cityWithForecast -> cityWithForecast.cityObjEntity.iso2 == country }
                .take(count)
        )
    }

    override suspend fun toggleFavourite(cityObjEntity: CityObjEntity) {
        citiesStore.removeIf { city -> city.identity == cityObjEntity.identity }
        citiesStore.add(cityObjEntity)
    }
}