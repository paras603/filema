package com.mastercoding.felem.presentation.di

import com.mastercoding.felem.data.datasource.MovieLocalDataSource
import com.mastercoding.felem.data.datasourceImpl.MovieLocalDataSourceImpl
import com.mastercoding.felem.data.db.MovieDao
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class LocalDataModule {

    @Singleton
    @Provides
    fun provideMovieLocalDataSource(movieDao: MovieDao): MovieLocalDataSource{
        return MovieLocalDataSourceImpl(movieDao)
    }

}