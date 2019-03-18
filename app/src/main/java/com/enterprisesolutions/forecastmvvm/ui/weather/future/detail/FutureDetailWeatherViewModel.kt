package com.enterprisesolutions.forecastmvvm.ui.weather.future.detail

import com.enterprisesolutions.forecastmvvm.data.provider.UnitProvider
import com.enterprisesolutions.forecastmvvm.data.repository.ForecastRepository
import com.enterprisesolutions.forecastmvvm.internal.lazyDeferred
import com.enterprisesolutions.forecastmvvm.ui.base.WeatherViewModel
import org.threeten.bp.LocalDate

class FutureDetailWeatherViewModel(
    private val detailDate: LocalDate,
    private val forecastRepository: ForecastRepository,
    unitProvider: UnitProvider
) : WeatherViewModel(forecastRepository, unitProvider) {

    val weather by lazyDeferred {
        forecastRepository.getFutureWeatherByDate(detailDate, super.isMetricUnit)
    }
}
