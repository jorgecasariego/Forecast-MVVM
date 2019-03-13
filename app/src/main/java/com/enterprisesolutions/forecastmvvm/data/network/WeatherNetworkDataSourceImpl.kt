package com.enterprisesolutions.forecastmvvm.data.network

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.enterprisesolutions.forecastmvvm.data.network.response.CurrentWeatherResponse
import com.enterprisesolutions.forecastmvvm.internal.NoConnectivityException

class WeatherNetworkDataSourceImpl (
    private val apixuWheatherApiService: ApixuWheatherApiService
) : WeatherNetworkDataSource {

    private val _downloadCurrentWeather = MutableLiveData<CurrentWeatherResponse>()
    override val downloadCurrentWeather: LiveData<CurrentWeatherResponse>
        get() = _downloadCurrentWeather

    override suspend fun fetchCurrentWeather(location: String, language: String) {
        try {
            val fetchCurrentWeather = apixuWheatherApiService
                .getCurrentWeather(location, language)
                .await()

            _downloadCurrentWeather.postValue(fetchCurrentWeather)
        } catch (e: NoConnectivityException) {
            Log.e("Connectivity", "No internet connection", e)
        }
    }
}