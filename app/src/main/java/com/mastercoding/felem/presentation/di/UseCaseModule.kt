package com.mastercoding.felem.presentation.di

import com.mastercoding.felem.domain.repository.MovieRepository
import com.mastercoding.felem.domain.usecases.GetMoviesUseCase
import com.mastercoding.felem.domain.usecases.UpdateMoviesUseCase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class UseCaseModule {

    @Singleton
    @Provides
    fun provideGetMovieUseCase(movieRepository: MovieRepository): GetMoviesUseCase{
        return GetMoviesUseCase(movieRepository)
    }

    @Singleton
    @Provides
    fun provideUpdateMovieUseCase(movieRepository: MovieRepository): UpdateMoviesUseCase{
        return UpdateMoviesUseCase(movieRepository)
    }

}