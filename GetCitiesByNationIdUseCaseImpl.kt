package com.sarang.torang.di.filter

import com.sarang.torang.api.ApiFilter
import com.sarang.torang.data.City
import com.sarang.torang.usecase.GetCitiesByNationIdUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class GetCitiesByNationIdUseCaseImpl {
    @Provides
    fun providesGetCitiesUseCase(apiFilter: ApiFilter): GetCitiesByNationIdUseCase {
        return object : GetCitiesByNationIdUseCase {
            override suspend fun invoke(id: Int): List<City> {
                return apiFilter.getCitiesByNationId(id).map { it.toCity() }
            }
        }
    }
}