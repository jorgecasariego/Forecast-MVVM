package com.enterprisesolutions.forecastmvvm.ui.weather.current

import androidx.lifecycle.ViewModel;
import com.enterprisesolutions.forecastmvvm.data.provider.UnitProvider
import com.enterprisesolutions.forecastmvvm.data.repository.ForecastRepository
import com.enterprisesolutions.forecastmvvm.internal.UnitSystem
import com.enterprisesolutions.forecastmvvm.internal.lazyDeferred

class CurrentWeatherViewModel(
    private val forecastRepository: ForecastRepository,
    unitProvider: UnitProvider
) : ViewModel() {

    private val unitSystem = unitProvider.getUnitSystem()
    val isMetric: Boolean
        get() = unitSystem == UnitSystem.METRIC

    val weather by lazyDeferred {
        forecastRepository.getCurrentWeather(isMetric)
    }

    val weatherLocation by lazyDeferred {
        forecastRepository.getWeatherLocation()
    }
}
