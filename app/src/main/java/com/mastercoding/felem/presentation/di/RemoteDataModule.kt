package com.mastercoding.felem.presentation.di

import com.mastercoding.felem.data.api.TMDBService
import com.mastercoding.felem.data.datasource.MovieRemoteDataSource
import com.mastercoding.felem.data.datasourceImpl.MovieRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RemoteDataModule(private val apiKey: String) {

    @Singleton
    @Provides
    fun provideMovieRemoteDataSource(tmdbService: TMDBService): MovieRemoteDataSource{
        return MovieRemoteDataSourceImpl(
            tmdbService,
            apiKey
        )
    }


}