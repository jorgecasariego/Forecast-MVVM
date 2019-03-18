package com.enterprisesolutions.forecastmvvm.ui.weather.current

import com.enterprisesolutions.forecastmvvm.data.provider.UnitProvider
import com.enterprisesolutions.forecastmvvm.data.repository.ForecastRepository
import com.enterprisesolutions.forecastmvvm.internal.lazyDeferred
import com.enterprisesolutions.forecastmvvm.ui.base.WeatherViewModel

class CurrentWeatherViewModel(
    private val forecastRepository: ForecastRepository,
    unitProvider: UnitProvider
) : WeatherViewModel(forecastRepository, unitProvider) {

    val weather by lazyDeferred {
        forecastRepository.getCurrentWeather(super.isMetricUnit)
    }

}
