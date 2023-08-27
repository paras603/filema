package com.mastercoding.felem.presentation.di

import com.mastercoding.felem.domain.usecases.GetMoviesUseCase
import com.mastercoding.felem.domain.usecases.UpdateMoviesUseCase
import com.mastercoding.felem.presentation.ViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class MovieModule {

    @MovieScope
    @Provides
    fun provideMovieViewModuleFactory(
        getMoviesUseCase: GetMoviesUseCase,
        updateMoviesUseCase: UpdateMoviesUseCase
    ): ViewModelFactory {
        return ViewModelFactory(
            getMoviesUseCase,
            updateMoviesUseCase
        )
    }


}