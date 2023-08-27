package com.mastercoding.felem.data.datasourceImpl

import com.mastercoding.felem.data.api.TMDBService
import com.mastercoding.felem.data.datasource.MovieRemoteDataSource
import com.mastercoding.felem.data.model.MovieList
import retrofit2.Response

class MovieRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey: String
) : MovieRemoteDataSource {
    override suspend fun getMovies(): Response<MovieList> =
        tmdbService.getPopularMovies(apiKey)

}