package com.mastercoding.felem

import android.app.Application
import com.mastercoding.felem.presentation.di.AppComponent
import com.mastercoding.felem.presentation.di.AppModule
import com.mastercoding.felem.presentation.di.DaggerAppComponent
import com.mastercoding.felem.presentation.di.Injector
import com.mastercoding.felem.presentation.di.MovieSubComponent
import com.mastercoding.felem.presentation.di.NetModule
import com.mastercoding.felem.presentation.di.RemoteDataModule

class App : Application(), Injector {

    private lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent.builder()
            .appModule(AppModule(applicationContext))
            .netModule(NetModule(BuildConfig.BASE_URL))
            .remoteDataModule(RemoteDataModule(BuildConfig.API_KEY))
            .build()
    }

    override fun createMovieSubComponen(): MovieSubComponent {
        return appComponent.movieSubComponent().create()
    }
}