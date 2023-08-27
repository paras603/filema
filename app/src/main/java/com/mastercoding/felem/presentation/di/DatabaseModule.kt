package com.mastercoding.felem.presentation.di

import android.content.Context
import androidx.room.Room
import com.mastercoding.felem.data.db.MovieDao
import com.mastercoding.felem.data.db.TMDBDatabase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DatabaseModule {

    @Singleton
    @Provides
    fun provideMovieDatabase(context: Context): TMDBDatabase {
        return Room.databaseBuilder(
            context,
            TMDBDatabase::class.java,
            "tmdbclient"
        ).build()
    }

    @Singleton
    @Provides
    fun provideMovieDAO(tmdbDatabase: TMDBDatabase): MovieDao {
        return tmdbDatabase.movieDao()
    }

}