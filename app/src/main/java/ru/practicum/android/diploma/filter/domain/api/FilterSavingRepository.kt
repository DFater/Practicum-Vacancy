package ru.practicum.android.diploma.filter.domain.api

import ru.practicum.android.diploma.filter.domain.models.FiltrationSettings
import ru.practicum.android.diploma.filter.domain.models.Industry

interface FilterSavingRepository {

    fun setIndustries(industry: Industry?)

    fun getSavedIndustries(): Industry?

    fun setSalary(salary: String)

    fun getSalary(): String

    fun setSalaryOnly(isChecked: Boolean)

    fun getSalaryOnly(): Boolean

    fun allDelete()

    fun getFilters(): FiltrationSettings

    suspend fun areFiltersChanged(): Boolean

    suspend fun areFiltersEmpty(): Boolean
}
