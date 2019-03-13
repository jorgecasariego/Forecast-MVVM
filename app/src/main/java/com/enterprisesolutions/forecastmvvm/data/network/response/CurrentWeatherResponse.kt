package com.enterprisesolutions.forecastmvvm.data.network.response

import com.enterprisesolutions.forecastmvvm.data.db.entity.CurrentWeatherEntry
import com.enterprisesolutions.forecastmvvm.data.db.entity.WeatherLocation
import com.google.gson.annotations.SerializedName

data class CurrentWeatherResponse(
    val location: WeatherLocation,
    @SerializedName("current")
    val currentWeatherEntry: CurrentWeatherEntry
)