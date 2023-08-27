package com.mastercoding.felem.data.datasource

import com.mastercoding.felem.data.model.MovieList
import retrofit2.Response

interface MovieRemoteDataSource {

    suspend fun getMovies() : Response<MovieList>

}