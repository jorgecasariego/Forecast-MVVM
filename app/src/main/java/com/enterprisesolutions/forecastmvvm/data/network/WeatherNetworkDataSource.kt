package com.enterprisesolutions.forecastmvvm.data.network

import androidx.lifecycle.LiveData
import com.enterprisesolutions.forecastmvvm.data.network.response.CurrentWeatherResponse

interface WeatherNetworkDataSource {
    val downloadCurrentWeather: LiveData<CurrentWeatherResponse>

    suspend fun fetchCurrentWeather(
        location: String,
        language: String
    )
}