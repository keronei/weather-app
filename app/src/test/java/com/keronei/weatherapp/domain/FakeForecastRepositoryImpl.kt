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

import com.keronei.weatherapp.core.Resource
import com.keronei.weatherapp.data.model.CityWithForecast
import com.keronei.weatherapp.data.model.Forecast
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow

@ExperimentalCoroutinesApi
class FakeForecastRepositoryImpl : ForecastRepository {
    override suspend fun fetchCityForecast(cityWithForecast: CityWithForecast): Flow<Resource<Forecast>> = callbackFlow {
        val validResponse = MockData.getForecastResponse()

        trySend(Resource.Success(validResponse))

        awaitClose { close() }
    }
}