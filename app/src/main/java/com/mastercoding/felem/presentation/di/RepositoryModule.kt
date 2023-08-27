package com.mastercoding.felem.presentation.di

import com.mastercoding.felem.data.MovieRepositoryImpl
import com.mastercoding.felem.data.datasource.MovieCacheDataSource
import com.mastercoding.felem.data.datasource.MovieLocalDataSource
import com.mastercoding.felem.data.datasource.MovieRemoteDataSource
import com.mastercoding.felem.domain.repository.MovieRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {

    @Singleton
    @Provides
    fun provideMovieRepository(
        movieRemoteDataSource: MovieRemoteDataSource,
        movieLocalDataSource: MovieLocalDataSource,
        movieCacheDataSource: MovieCacheDataSource
    ): MovieRepository {
        return MovieRepositoryImpl(
            movieRemoteDataSource,
            movieLocalDataSource,
            movieCacheDataSource
        )
    }

}