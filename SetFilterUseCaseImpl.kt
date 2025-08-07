package com.sarang.torang.di.filter_di

import com.sarang.torang.di.repository.repository.impl.FindRepositoryImpl
import com.sarang.torang.usecase.SetFilterUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class SetFilterUseCaseImpl {
    @Provides
    fun provideSetFilterUseCase(findRepository: FindRepositoryImpl): SetFilterUseCase {
        return object : SetFilterUseCase {
            override suspend fun setFoodType(string: String) {
                findRepository.setFoodType(string)
            }

            override suspend fun setPrice(string: String) {
                findRepository.setPrice(string)
            }

            override suspend fun setRating(string: String) {
                findRepository.setRating(string)
            }

            override suspend fun setDistance(string: String) {
                findRepository.setDistance(string)
            }
        }
    }
}