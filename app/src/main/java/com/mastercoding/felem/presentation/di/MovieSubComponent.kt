package com.mastercoding.felem.presentation.di

import com.mastercoding.felem.presentation.MainActivity
import dagger.Subcomponent

@MovieScope
@Subcomponent(modules = [MovieModule::class])
interface MovieSubComponent {
    fun inject(movieActivity: MainActivity)

    @Subcomponent.Factory
    interface Factory{
        fun create(): MovieSubComponent
    }

}