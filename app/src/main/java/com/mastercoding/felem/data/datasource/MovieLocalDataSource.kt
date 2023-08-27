package com.mastercoding.felem.data.datasource

import com.mastercoding.felem.data.model.Movie

interface MovieLocalDataSource {

    suspend fun getMoviesFromDB(): List<Movie>

    suspend fun saveMoviesToDB(movies: List<Movie>)

    suspend fun clearAll()

}