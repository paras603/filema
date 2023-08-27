package com.mastercoding.felem.data.datasourceImpl

import com.mastercoding.felem.data.datasource.MovieLocalDataSource
import com.mastercoding.felem.data.db.MovieDao
import com.mastercoding.felem.data.model.Movie
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MovieLocalDataSourceImpl(private val movieDao: MovieDao) : MovieLocalDataSource {
    override suspend fun getMoviesFromDB(): List<Movie> {
        return movieDao.getMovies()
    }

    override suspend fun saveMoviesToDB(movies: List<Movie>) {
        CoroutineScope(Dispatchers.IO).launch {
            movieDao.saveMovies(movies)
        }
    }

    override suspend fun clearAll() {
        CoroutineScope(Dispatchers.IO).launch {
            movieDao.deleteALlMovies()
        }
    }
}