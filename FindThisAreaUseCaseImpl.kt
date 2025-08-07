package com.sarang.torang.di.filter_di

import com.sarang.torang.di.repository.repository.impl.FindRepositoryImpl
import com.sarang.torang.usecase.FindThisAreaUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class FindThisAreaUseCaseImpl {
    @Provides
    fun provideFindThisAreaUseCase(findRepository: FindRepositoryImpl): FindThisAreaUseCase {
        return object : FindThisAreaUseCase {
            override suspend fun invoke() {
                findRepository.findThisArea()
            }
        }
    }
}