package com.mastercoding.felem.domain.usecases

import com.mastercoding.felem.data.model.Movie
import com.mastercoding.felem.domain.repository.MovieRepository

class GetMoviesUseCase(private val movieRepository: MovieRepository) {

    suspend fun execute(): List<Movie>? = movieRepository.getMovies()
}