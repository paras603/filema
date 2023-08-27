package com.mastercoding.felem.data.datasourceImpl

import com.mastercoding.felem.data.datasource.MovieCacheDataSource
import com.mastercoding.felem.data.model.Movie

class MovieCacheDataSourceImpl : MovieCacheDataSource {

    private var movieList = ArrayList<Movie>()

    override suspend fun getMoviesFromCache(): List<Movie> {
        return movieList
    }

    override suspend fun saveMoviesToCache(movies: List<Movie>) {
        movieList.clear()
        movieList = ArrayList(movies)
    }
}