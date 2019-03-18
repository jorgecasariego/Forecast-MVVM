package com.enterprisesolutions.forecastmvvm.data.network

import androidx.lifecycle.LiveData
import com.enterprisesolutions.forecastmvvm.data.network.response.CurrentWeatherResponse
import com.enterprisesolutions.forecastmvvm.data.network.response.FutureWeatherResponse

interface WeatherNetworkDataSource {
    val downloadCurrentWeather: LiveData<CurrentWeatherResponse>
    val downloadedFutureWeather: LiveData<FutureWeatherResponse>

    suspend fun fetchCurrentWeather(
        location: String,
        language: String
    )

    suspend fun fetchFutureWeather(
        location: String,
        language: String
    )
}