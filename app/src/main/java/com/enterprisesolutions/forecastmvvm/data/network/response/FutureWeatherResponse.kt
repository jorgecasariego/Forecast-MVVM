package com.enterprisesolutions.forecastmvvm.data.network.response

import com.enterprisesolutions.forecastmvvm.data.db.entity.WeatherLocation
import com.google.gson.annotations.SerializedName

data class FutureWeatherResponse(
    @SerializedName("forecast")
    val futureWeatherEntries: ForecastDaysContainer,
    val location: WeatherLocation
)