package ru.practicum.android.diploma.search.domain.impl

import kotlinx.coroutines.flow.Flow
import ru.practicum.android.diploma.core.models.VacancySearchParams
import ru.practicum.android.diploma.search.domain.api.SearchInteractor
import ru.practicum.android.diploma.search.domain.api.SearchRepository
import ru.practicum.android.diploma.search.domain.models.Resource
import ru.practicum.android.diploma.search.domain.models.SearchVacancyResult

class SearchInteractorImpl(
    private val searchRepository: SearchRepository,
) : SearchInteractor {

    override fun searchVacancy(searchText: String, page: Int, perPage: Int): Flow<Resource<SearchVacancyResult>> {
        return searchRepository.searchVacancy(
            VacancySearchParams(
                searchText,
                null,
                null,
                null,
                null,
                page,
                perPage
            )
        )
    }
}
