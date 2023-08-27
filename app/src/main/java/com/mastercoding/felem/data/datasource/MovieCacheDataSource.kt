package com.mastercoding.felem.data.datasource

import com.mastercoding.felem.data.model.Movie

interface MovieCacheDataSource {

    suspend fun getMoviesFromCache(): List<Movie>

    suspend fun saveMoviesToCache(movies: List<Movie>)

}