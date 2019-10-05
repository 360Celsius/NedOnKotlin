package com.a360celsius.ned.modules

import android.app.Application
import android.content.Context
import dagger.Module
import javax.inject.Singleton
import dagger.Provides


@Module
class ContextApplicationModule {

    lateinit var application: Application

    constructor(application: Application) {
        this.application = application
    }


    @Provides
    @Singleton
    fun provideContext(): Context {
        return application
    }

}