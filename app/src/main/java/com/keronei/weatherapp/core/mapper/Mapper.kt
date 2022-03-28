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
package com.keronei.weatherapp.core.mapper

import kotlinx.coroutines.*

abstract class Mapper<Input, Output> {
    abstract fun map(input: Input): Output

    suspend fun mapList(inputs: List<Input>?, sentCoroutineScope: CoroutineScope): List<Output> {

        val deferredOutputs = mutableListOf<Deferred<Output>>()

        val job = sentCoroutineScope.async {
            inputs?.forEach { input: Input ->
                val pendingResult = async {
                    map(input)
                }
                deferredOutputs.add(pendingResult)
            }
        }

        job.join()

        return deferredOutputs.awaitAll()
    }
}