package com.enterprisesolutions.forecastmvvm.ui.base

import androidx.lifecycle.ViewModel
import com.enterprisesolutions.forecastmvvm.data.provider.UnitProvider
import com.enterprisesolutions.forecastmvvm.data.repository.ForecastRepository
import com.enterprisesolutions.forecastmvvm.internal.UnitSystem
import com.enterprisesolutions.forecastmvvm.internal.lazyDeferred


abstract class WeatherViewModel(
    private val forecastRepository: ForecastRepository,
    unitProvider: UnitProvider
) : ViewModel() {

    private val unitSystem = unitProvider.getUnitSystem()

    val isMetricUnit: Boolean
        get() = unitSystem == UnitSystem.METRIC

    val weatherLocation by lazyDeferred {
        forecastRepository.getWeatherLocation()
    }
}