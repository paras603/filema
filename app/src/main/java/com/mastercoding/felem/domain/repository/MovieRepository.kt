package com.mastercoding.felem.domain.repository

import com.mastercoding.felem.data.model.Movie

interface MovieRepository {

    suspend fun getMovies(): List<Movie>?
    suspend fun updateMovies(): List<Movie>?

}