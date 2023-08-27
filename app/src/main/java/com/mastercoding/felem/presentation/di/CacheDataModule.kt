package com.mastercoding.felem.presentation.di

import com.mastercoding.felem.data.datasource.MovieCacheDataSource
import com.mastercoding.felem.data.datasourceImpl.MovieCacheDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class CacheDataModule {

    @Singleton
    @Provides
    fun provideMovieCacheDataSource(): MovieCacheDataSource{
        return MovieCacheDataSourceImpl()
    }

}