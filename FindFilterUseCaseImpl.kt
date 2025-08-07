package com.sarang.torang.di.filter_di

import com.sarang.torang.di.repository.repository.impl.FindRepositoryImpl
import com.sarang.torang.repository.FindRepository
import com.sarang.torang.usecase.FindFilterUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class FindFilterUseCaseImpl {
    @Provides
    fun provideFindFilterUseCase(findRepository: FindRepositoryImpl): FindFilterUseCase {
        return object : FindFilterUseCase {
            override suspend fun invoke() {
                findRepository.findFilter()
            }
        }
    }
}