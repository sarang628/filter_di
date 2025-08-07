package com.sarang.torang.di.filter_di

import com.sarang.torang.di.repository.repository.impl.FindRepositoryImpl
import com.sarang.torang.usecase.GetFiltersUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.flow.StateFlow

@Module
@InstallIn(SingletonComponent::class)
class GetFiltersUseCaseImpl {
    @Provides
    fun provideGetFiltersUseCase(repository: FindRepositoryImpl): GetFiltersUseCase {
        return object : GetFiltersUseCase {
            override fun getFoodType(): StateFlow<List<String>> {
                return repository.getFoodType()
            }

            override fun getPrice(): StateFlow<List<String>> {
                return repository.getPrices()
            }

            override fun getRating(): StateFlow<List<String>> {
                return repository.getRatings()
            }

            override fun getDistance(): StateFlow<String> {
                return repository.getDistances()
            }
        }
    }
}