package com.mastercoding.felem.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.mastercoding.felem.domain.usecases.GetMoviesUseCase
import com.mastercoding.felem.domain.usecases.UpdateMoviesUseCase

class ViewModelFactory(
    private val getMoviesUseCase: GetMoviesUseCase,
    private val updateMoviesUseCase: UpdateMoviesUseCase
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MyViewModel(getMoviesUseCase, updateMoviesUseCase) as T
    }
}