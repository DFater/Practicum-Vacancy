package ru.practicum.android.diploma.search.domain.models

sealed interface Resource<T> {
    data class Success<T>(val data: T) : Resource<T>
    data class Error<T>(val errorType: ErrorType) : Resource<T>
}
