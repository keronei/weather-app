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
package com.co.keronei.weatherapp.repository_tests

object MockData {
    fun getForecastResponse(): String {
        return "{'lat':34.3305,'lon':47.1594,'timezone':'Asia/Tehran','timezone_offset':16200,'hourly':[{'dt':1648123200,'temp':291.56,'feels_like':289.87,'pressure':1007,'humidity':16,'dew_point':266.18,'uvi':2.28,'clouds':29,'visibility':10000,'wind_speed':11.61,'wind_deg':228,'wind_gust':20.4,'weather':[{'id':802,'main':'Clouds','description':'scattered clouds','icon':'03d'}],'pop':0.05},{'dt':1648126800,'temp':292.17,'feels_like':290.44,'pressure':1007,'humidity':12,'dew_point':263.33,'uvi':1.23,'clouds':20,'visibility':10000,'wind_speed':10.18,'wind_deg':242,'wind_gust':15.07,'weather':[{'id':801,'main':'Clouds','description':'few clouds','icon':'02d'}],'pop':0},{'dt':1648130400,'temp':290.71,'feels_like':288.99,'pressure':1007,'humidity':18,'dew_point':266.92,'uvi':0.31,'clouds':16,'visibility':10000,'wind_speed':8.75,'wind_deg':253,'wind_gust':11.02,'weather':[{'id':801,'main':'Clouds','description':'few clouds','icon':'02d'}],'pop':0},{'dt':1648134000,'temp':288.26,'feels_like':286.53,'pressure':1007,'humidity':27,'dew_point':269.84,'uvi':0,'clouds':12,'visibility':10000,'wind_speed':7.66,'wind_deg':257,'wind_gust':10.35,'weather':[{'id':801,'main':'Clouds','description':'few clouds','icon':'02d'}],'pop':0},{'dt':1648137600,'temp':285.33,'feels_like':283.6,'pressure':1009,'humidity':38,'dew_point':271.64,'uvi':0,'clouds':9,'visibility':10000,'wind_speed':7.31,'wind_deg':258,'wind_gust':10.29,'weather':[{'id':800,'main':'Clear','description':'clear sky','icon':'01n'}],'pop':0},{'dt':1648141200,'temp':282.35,'feels_like':279.32,'pressure':1011,'humidity':49,'dew_point':272.31,'uvi':0,'clouds':6,'visibility':10000,'wind_speed':6.17,'wind_deg':256,'wind_gust':9.03,'weather':[{'id':800,'main':'Clear','description':'clear sky','icon':'01n'}],'pop':0},{'dt':1648144800,'temp':279.22,'feels_like':275.34,'pressure':1013,'humidity':58,'dew_point':270.2,'uvi':0,'clouds':6,'visibility':10000,'wind_speed':6.16,'wind_deg':258,'wind_gust':8.95,'weather':[{'id':800,'main':'Clear','description':'clear sky','icon':'01n'}],'pop':0},{'dt':1648148400,'temp':278.28,'feels_like':274.07,'pressure':1015,'humidity':60,'dew_point':269.88,'uvi':0,'clouds':87,'visibility':10000,'wind_speed':6.35,'wind_deg':262,'wind_gust':9.61,'weather':[{'id':804,'main':'Clouds','description':'overcast clouds','icon':'04n'}],'pop':0.04},{'dt':1648152000,'temp':277.49,'feels_like':274.43,'pressure':1015,'humidity':60,'dew_point':269.09,'uvi':0,'clouds':80,'visibility':10000,'wind_speed':3.63,'wind_deg':253,'wind_gust':7.67,'weather':[{'id':803,'main':'Clouds','description':'broken clouds','icon':'04n'}],'pop':0.07},{'dt':1648155600,'temp':276.8,'feels_like':274.1,'pressure':1015,'humidity':61,'dew_point':268.69,'uvi':0,'clouds':53,'visibility':10000,'wind_speed':2.92,'wind_deg':235,'wind_gust':5.91,'weather':[{'id':803,'main':'Clouds','description':'broken clouds','icon':'04n'}],'pop':0.02},{'dt':1648159200,'temp':276.59,'feels_like':274.3,'pressure':1015,'humidity':59,'dew_point':268.06,'uvi':0,'clouds':40,'visibility':10000,'wind_speed':2.39,'wind_deg':227,'wind_gust':4.45,'weather':[{'id':802,'main':'Clouds','description':'scattered clouds','icon':'03n'}],'pop':0.02},{'dt':1648162800,'temp':276.35,'feels_like':274.37,'pressure':1015,'humidity':56,'dew_point':267.12,'uvi':0,'clouds':34,'visibility':10000,'wind_speed':2.05,'wind_deg':232,'wind_gust':3.22,'weather':[{'id':802,'main':'Clouds','description':'scattered clouds','icon':'03n'}],'pop':0},{'dt':1648166400,'temp':276.14,'feels_like':274.5,'pressure':1015,'humidity':53,'dew_point':266.25,'uvi':0,'clouds':28,'visibility':10000,'wind_speed':1.73,'wind_deg':228,'wind_gust':2.18,'weather':[{'id':802,'main':'Clouds','description " +
            "':'scattered clouds','icon':'03n'}],'pop':0},{'dt':1648170000,'temp':275.9,'feels_like':274.69,'pressure':1015,'humidity':52,'dew_point':265.86,'uvi':0,'clouds':2,'visibility':10000,'wind_speed':1.39,'wind_deg':205,'wind_gust':1.8,'weather':[{'id':800,'main':'Clear','description':'clear sky','icon':'01n'}],'pop':0},{'dt':1648173600,'temp':275.7,'feels_like':274.55,'pressure':1015,'humidity':52,'dew_point':265.6,'uvi':0,'clouds':4,'visibility':10000,'wind_speed':1.34,'wind_deg':199,'wind_gust':1.62,'weather':[{'id':800,'main':'Clear','description':'clear sky','icon':'01n'}],'pop':0},{'dt':1648177200,'temp':275.63,'feels_like':274.39,'pressure':1016,'humidity':52,'dew_point':265.6,'uvi':0,'clouds':4,'visibility':10000,'wind_speed':1.39,'wind_deg':205,'wind_gust':1.64,'weather':[{'id':800,'main':'Clear','description':'clear sky','icon':'01d'}],'pop':0},{'dt':1648180800,'temp':277.3,'feels_like':276.14,'pressure':1016,'humidity':47,'dew_point':265.77,'uvi':0.51,'clouds':4,'visibility':10000,'wind_speed':1.49,'wind_deg':196,'wind_gust':2.62,'weather':[{'id':800,'main':'Clear','description':'clear sky','icon':'01d'}],'pop':0},{'dt':1648184400,'temp':278.88,'feels_like':276.74,'pressure':1016,'humidity':42,'dew_point':265.64,'uvi':1.73,'clouds':3,'visibility':10000,'wind_speed':2.72,'wind_deg':220,'wind_gust':3.98,'weather':[{'id':800,'main':'Clear','description':'clear sky','icon':'01d'}],'pop':0},{'dt':1648188000,'temp':280.04,'feels_like':277.69,'pressure':1016,'humidity':38,'dew_point':265.46,'uvi':3.66,'clouds':3,'visibility':10000,'wind_speed':3.37,'wind_deg':223,'wind_gust':4.74,'weather':[{'id':800,'main':'Clear','description':'clear sky','icon':'01d'}],'pop':0},{'dt':1648191600,'temp':281.29,'feels_like':278.8,'pressure':1015,'humidity':34,'dew_point':265.4,'uvi':5.64,'clouds':5,'visibility':10000,'wind_speed':4.13,'wind_deg':229,'wind_gust':6.03,'weather':[{'id':800,'main':'Clear','description':'clear sky','icon':'01d'}],'pop':0},{'dt':1648195200,'temp':282.37,'feels_like':279.74,'pressure':1015,'humidity':32,'dew_point':265.38,'uvi':7.21,'clouds':8,'visibility':10000,'wind_speed':5.06,'wind_deg':232,'wind_gust':7.51,'weather':[{'id':800,'main':'Clear','description':'clear sky','icon':'01d'}],'pop':0},{'dt':1648198800,'temp':283.4,'feels_like':281.24,'pressure':1014,'humidity':29,'dew_point':265.09,'uvi':7.68,'clouds':35,'visibility':10000,'wind_speed':5.97,'wind_deg':232,'wind_gust':9.04,'weather':[{'id':802,'main':'Clouds','description':'scattered clouds','icon':'03d'}],'pop':0},{'dt':1648202400,'temp':284.05,'feels_like':281.9,'pressure':1013,'humidity':27,'dew_point':264.49,'uvi':6.38,'clouds':51,'visibility':10000,'wind_speed':7.03,'wind_deg':234,'wind_gust':10.04,'weather':[{'id':803,'main':'Clouds','description':'broken clouds','icon':'04d'}],'pop':0},{'dt':1648206000,'temp':284.26,'feels_like':282.08,'pressure':1012,'humidity':25,'dew_point':263.94,'uvi':4.73,'clouds':58,'visibility':10000,'wind_speed':8.36,'wind_deg':235,'wind_gust':10.5,'weather':[{'id':803,'main':'Clouds','description':'broken clouds','icon':'04d'}],'pop':0},{'dt':1648209600,'temp':283.85,'feels_like':281.65,'pressure':1012,'humidity':26,'dew_point':264.08,'uvi':2.78,'clouds':56,'visibility':10000,'wind_speed':9.15,'wind_deg':234,'wind_gust':11.09,'weather':[{'id':803,'main':'Clouds','description':'broken clouds','icon':'04d'}],'pop':0},{'dt':1648213200,'temp':283.18,'feels_like':280.94,'pressure':1013,'humidity':27,'dew_point':264.05,'uvi':1.22,'clouds':30,'visibility':10000,'wind_speed':8.98,'wind_deg':231,'wind_gust':11.18,'weather':[{'id':802,'main':'Clouds','description':'scattered clouds','icon':'03d'}],'pop':0},{'dt':1648216800,'temp':282.54,'feels_like':279.02,'pressure':1013,'humidity':30,'dew_point':264.86,'uvi':0.31,'clouds':36,'visibility':10000,'wind_speed':8.05,'wind_deg':228,'wind_gust':10.58,'weather':[{'id':802,'main':'Clouds','description':'scattered clouds','icon':'03d'}],'pop':0},{'dt':1648220400,'temp':281,'feels_like':277.21" +
            ",'pressure':1014,'humidity':34,'dew_point':264.86,'uvi':0,'clouds':46,'visibility':10000,'wind_speed':7.37,'wind_deg':230,'wind_gust':11.36,'weather':[{'id':802,'main':'Clouds','description':'scattered clouds','icon':'03d'}],'pop':0},{'dt':1648224000,'temp':279.96,'feels_like':276.17,'pressure':1015,'humidity':40,'dew_point':266.16,'uvi':0,'clouds':54,'visibility':10000,'wind_speed':6.47,'wind_deg':234,'wind_gust':11.34,'weather':[{'id':803,'main':'Clouds','description':'broken clouds','icon':'04n'}],'pop':0},{'dt':1648227600,'temp':279.35,'feels_like':275.46,'pressure':1016,'humidity':47,'dew_point':267.67,'uvi':0,'clouds':61,'visibility':10000,'wind_speed':6.28,'wind_deg':247,'wind_gust':10.56,'weather':[{'id':803,'main':'Clouds','description':'broken clouds','icon':'04n'}],'pop':0},{'dt':1648231200,'temp':278.65,'feels_like':274.64,'pressure':1017,'humidity':53,'dew_point':268.42,'uvi':0,'clouds':63,'visibility':10000,'wind_speed':6.09,'wind_deg':251,'wind_gust':9.74,'weather':[{'id':803,'main':'Clouds','description':'broken clouds','icon':'04n'}],'pop':0},{'dt':1648234800,'temp':277.93,'feels_like':274.13,'pressure':1018,'humidity':57,'dew_point':268.77,'uvi':0,'clouds':59,'visibility':10000,'wind_speed':5.17,'wind_deg':249,'wind_gust':8.92,'weather':[{'id':600,'main':'Snow','description':'light snow','icon':'13n'}],'pop':0.24,'snow':{'1h':0.11}},{'dt':1648238400,'temp':277.05,'feels_like':274.43,'pressure':1019,'humidity':63,'dew_point':269.22,'uvi':0,'clouds':48,'visibility':10000,'wind_speed':2.88,'wind_deg':248,'wind_gust':5.08,'weather':[{'id':600,'main':'Snow','description':'light snow','icon':'13n'}],'pop':0.26,'snow':{'1h':0.13}},{'dt':1648242000,'temp':276.59,'feels_like':275.18,'pressure':1019,'humidity':65,'dew_point':269.3,'uvi':0,'clouds':41,'visibility':10000,'wind_speed':1.6,'wind_deg':242,'wind_gust':2.08,'weather':[{'id':802,'main':'Clouds','description':'scattered clouds','icon':'03n'}],'pop':0.22},{'dt':1648245600,'temp':276.41,'feels_like':274.92,'pressure':1019,'humidity':64,'dew_point':269.02,'uvi':0,'clouds':37,'visibility':10000,'wind_speed':1.64,'wind_deg':213,'wind_gust':1.88,'weather':[{'id':802,'main':'Clouds','description':'scattered clouds','icon':'03n'}],'pop':0.2},{'dt':1648249200,'temp':276.19,'feels_like':274.27,'pressure':1019,'humidity':64,'dew_point':268.79,'uvi':0,'clouds':40,'visibility':10000,'wind_speed':1.97,'wind_deg':216,'wind_gust':2.14,'weather':[{'id':802,'main':'Clouds','description':'scattered clouds','icon':'03n'}],'pop':0.22},{'dt':1648252800,'temp':276.58,'feels_like':274.3,'pressure':1019,'humidity':66,'dew_point':269.43,'uvi':0,'clouds':50,'visibility':10000,'wind_speed':2.38,'wind_deg':235,'wind_gust':4.95,'weather':[{'id':802,'main':'Clouds','description':'scattered clouds','icon':'03n'}],'pop':0.22},{'dt':1648256400,'temp':276.04,'feels_like':273.42,'pressure':1020,'humidity':69,'dew_point':269.61,'uvi':0,'clouds':97,'visibility':10000,'wind_speed':2.65,'wind_deg':258,'wind_gust':4.24,'weather':[{'id':804,'main':'Clouds','description':'overcast clouds','icon':'04n'}],'pop':0.38},{'dt':1648260000,'temp':276.08,'feels_like':274.29,'pressure':1021,'humidity':76,'dew_point':270.71,'uvi':0,'clouds':99,'visibility':10000,'wind_speed':1.84,'wind_deg':260,'wind_gust':3.8,'weather':[{'id':600,'main':'Snow','description':'light snow','icon':'13n'}],'pop':0.55,'snow':{'1h':0.31}},{'dt':1648263600,'temp':275.03,'feels_like':275.03,'pressure':1022,'humidity':81,'dew_point':270.72,'uvi':0,'clouds':89,'visibility':10000,'wind_speed':1.14,'wind_deg':264,'wind_gust':1.86,'weather':[{'id':804,'main':'Clouds','description':'overcast clouds','icon':'04d'}],'pop':0.38},{'dt':1648267200,'temp':276.43,'feels_like':276.43,'pressure':1023,'humidity':72,'dew_point':270.45,'uvi':0.5,'clouds':74,'visibility':10000,'wind_speed':1.11,'wind_deg':230,'wind_gust':2.76,'weather':[{'id':803,'main':'Clouds','description':'broken clouds','icon':'04d'}],'pop':0.32},{'dt':1648270800,'temp':278.19,'feels_l" +
            "ike':276,'pressure':1023,'humidity':61,'dew_point':269.96,'uvi':1.65,'clouds':65,'visibility':10000,'wind_speed':2.62,'wind_deg':229,'wind_gust':3.84,'weather':[{'id':803,'main':'Clouds','description':'broken clouds','icon':'04d'}],'pop':0.32},{'dt':1648274400,'temp':279.49,'feels_like':277.03,'pressure':1023,'humidity':54,'dew_point':269.59,'uvi':3.45,'clouds':57,'visibility':10000,'wind_speed':3.35,'wind_deg':242,'wind_gust':4.53,'weather':[{'id':803,'main':'Clouds','description':'broken clouds','icon':'04d'}],'pop':0.32},{'dt':1648278000,'temp':280.74,'feels_like':278.25,'pressure':1022,'humidity':46,'dew_point':268.65,'uvi':4.86,'clouds':6,'visibility':10000,'wind_speed':3.88,'wind_deg':250,'wind_gust':4.94,'weather':[{'id':800,'main':'Clear','description':'clear sky','icon':'01d'}],'pop':0},{'dt':1648281600,'temp':281.89,'feels_like':279.54,'pressure':1021,'humidity':42,'dew_point':268.5,'uvi':6.2,'clouds':10,'visibility':10000,'wind_speed':4.13,'wind_deg':254,'wind_gust':5.23,'weather':[{'id':800,'main':'Clear','description':'clear sky','icon':'01d'}],'pop':0},{'dt':1648285200,'temp':282.9,'feels_like':280.77,'pressure':1020,'humidity':38,'dew_point':267.97,'uvi':6.6,'clouds':12,'visibility':10000,'wind_speed':4.17,'wind_deg':256,'wind_gust':5.88,'weather':[{'id':801,'main':'Clouds','description':'few clouds','icon':'02d'}],'pop':0},{'dt':1648288800,'temp':283.95,'feels_like':281.92,'pressure':1019,'humidity':32,'dew_point':266.68,'uvi':6.42,'clouds':10,'visibility':10000,'wind_speed':4.4,'wind_deg':258,'wind_gust':6.57,'weather':[{'id':800,'main':'Clear','description':'clear sky','icon':'01d'}],'pop':0},{'dt':1648292400,'temp':284.6,'feels_like':282.53,'pressure':1019,'humidity':28,'dew_point':265.55,'uvi':4.77,'clouds':9,'visibility':10000,'wind_speed':5.14,'wind_deg':263,'wind_gust':6.97,'weather':[{'id':800,'main':'Clear','description':'clear sky','icon':'01d'}],'pop':0}],'daily':[{'dt':1648110600,'sunrise':1648090197,'sunset':1648134322,'moonrise':1648068900,'moonset':1648104480,'moon_phase':0.72,'temp':{'day':289.32,'min':278.28,'max':292.17,'night':278.28,'eve':290.71,'morn':282.99},'feels_like':{'day':287.96,'night':274.07,'eve':288.99,'morn':281.55},'pressure':1008,'humidity':37,'dew_point':273.3,'wind_speed':11.81,'wind_deg':220,'wind_gust':21.06,'weather':[{'id':804,'main':'Clouds','description':'overcast clouds','icon':'04d'}],'clouds':100,'pop':0.39,'uvi':5.93},{'dt':1648197000,'sunrise':1648176514,'sunset':1648220768,'moonrise':1648159320,'moonset':1648194300,'moon_phase':0.75,'temp':{'day':282.37,'min':275.63,'max':284.26,'night':277.93,'eve':282.54,'morn':275.7},'feels_like':{'day':279.74,'night':274.13,'eve':279.02,'morn':274.55},'pressure':1015,'humidity':32,'dew_point':265.38,'wind_speed':9.15,'wind_deg':234,'wind_gust':11.36,'weather':[{'id':600,'main':'Snow','description':'light snow','icon':'13d'}],'clouds':8,'pop':0.24,'snow':0.11,'uvi':7.68},{'dt':1648283400,'sunrise':1648262830,'sunset':1648307213,'moonrise':1648249500,'moonset':1648284540,'moon_phase':0.79,'temp':{'day':281.89,'min':275.03,'max':284.66,'night':277.57,'eve':283.09,'morn':276.08},'feels_like':{'day':279.54,'night':275.78,'eve':280.43,'morn':274.29},'pressure':1021,'humidity':42,'dew_point':268.5,'wind_speed':5.94,'wind_deg':268,'wind_gust':6.97,'weather':[{'id':600,'main':'Snow','description':'light snow','icon':'13d'}],'clouds':10,'pop':0.55,'snow':0.44,'uvi':6.6},{'dt':1648369800,'sunrise':1648349147,'sunset':1648393659,'moonrise':1648339140,'moonset':1648375020,'moon_phase':0.83,'temp':{'day':284.01,'min':274.26,'max':285.13,'night':277.79,'eve':280.66,'morn':274.31},'feels_like':{'day':281.8,'night':275.09,'eve':277.57,'morn':272.83},'pressure':1020,'humidity':25,'dew_point':263.52,'wind_speed':6.88,'wind_deg':262,'wind_gust':7.79,'weather':[{'id':800,'main':'Clear','description':'clear sky','icon':'01d'}],'clouds':0,'pop':0,'uvi':7.64},{'dt':1648456200,'sunrise':1648435464,'sunset':1648480104,'moonrise':1648428300,'moonset':1" +
            "648465620,'moon_phase':0.86,'temp':{'day':284.46,'min':274.57,'max':286.81,'night':279.87,'eve':283.33,'morn':274.57},'feels_like':{'day':282.43,'night':278.24,'eve':281.34,'morn':274.57},'pressure':1022,'humidity':30,'dew_point':266.27,'wind_speed':3.53,'wind_deg':295,'wind_gust':4.5,'weather':[{'id':800,'main':'Clear','description':'clear sky','icon':'01d'}],'clouds':0,'pop':0,'uvi':7.52},{'dt':1648542600,'sunrise':1648521780,'sunset':1648566550,'moonrise':1648516980,'moonset':1648556100,'moon_phase':0.9,'temp':{'day':289.16,'min':276.91,'max':291.46,'night':285.24,'eve':287.12,'morn':276.91},'feels_like':{'day':287.39,'night':283.24,'eve':285.3,'morn':276.91},'pressure':1020,'humidity':22,'dew_point':266.28,'wind_speed':1.78,'wind_deg':65,'wind_gust':2.6,'weather':[{'id':800,'main':'Clear','description':'clear sky','icon':'01d'}],'clouds':0,'pop':0,'uvi':8},{'dt':1648629000,'sunrise':1648608097,'sunset':1648652995,'moonrise':1648605360,'moonset':1648646460,'moon_phase':0.93,'temp':{'day':293.38,'min':282.12,'max':293.38,'night':285.84,'eve':287.59,'morn':282.12},'feels_like':{'day':291.85,'night':284.31,'eve':286.26,'morn':280.7},'pressure':1013,'humidity':15,'dew_point':264.52,'wind_speed':7.69,'wind_deg':197,'wind_gust':13.2,'weather':[{'id':500,'main':'Rain','description':'light rain','icon':'10d'}],'clouds':98,'pop':0.32,'rain':0.21,'uvi':8},{'dt':1648715400,'sunrise':1648694415,'sunset':1648739441,'moonrise':1648693560,'moonset':1648736640,'moon_phase':0.97,'temp':{'day':292.35,'min':281.56,'max':293.65,'night':284.43,'eve':288,'morn':281.56},'feels_like':{'day':290.72,'night':282.55,'eve':286.3,'morn':280.94},'pressure':1016,'humidity':15,'dew_point':264.01,'wind_speed':4.84,'wind_deg':254,'wind_gust':6.81,'weather':[{'id':800,'main':'Clear','description':'clear sky','icon':'01d'}],'clouds':0,'pop':0,'uvi':8}]}"
    }
}