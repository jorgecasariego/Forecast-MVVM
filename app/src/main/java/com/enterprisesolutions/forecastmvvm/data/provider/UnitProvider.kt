package com.enterprisesolutions.forecastmvvm.data.provider

import com.enterprisesolutions.forecastmvvm.internal.UnitSystem

interface UnitProvider {
    fun getUnitSystem(): UnitSystem
}