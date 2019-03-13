package com.enterprisesolutions.forecastmvvm.data.provider

import com.enterprisesolutions.forecastmvvm.data.db.entity.WeatherLocation

class LocationProviderImpl : LocationProvider {
    override suspend fun hasLocationChanged(lastWeatherLocation: WeatherLocation): Boolean {
        return false
    }

    override suspend fun getPreferredLocationString(): String {
        return "Asunción"
    }
}