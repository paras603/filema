package com.mastercoding.felem.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.mastercoding.felem.domain.usecases.GetMoviesUseCase
import com.mastercoding.felem.domain.usecases.UpdateMoviesUseCase

class MyViewModel(
    private val getMoviesUseCase: GetMoviesUseCase,
    private val updateMoviesUseCase: UpdateMoviesUseCase
) : ViewModel() {

    fun getMovies() = liveData {
        val movieList = getMoviesUseCase.execute()
        emit(movieList)
    }

    fun updateMovies() = liveData{
        val movieList = updateMoviesUseCase.execute()
        emit(movieList)
    }
}