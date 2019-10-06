package com.a360celsius.ned.application

import android.app.Application
import com.a360celsius.ned.interfaces.ApplicayionComponenet
import com.a360celsius.ned.interfaces.DaggerApplicayionComponenet
import com.a360celsius.ned.modules.ContextApplicationModule


class App: Application() {
    private lateinit var component: ApplicayionComponenet

    override fun onCreate() {
        super.onCreate()

        //needs to run once to generate it
        component = DaggerApplicayionComponenet.builder()
            .contextApplicationModule(ContextApplicationModule(this))
            .build()

    }


    fun getComponent(): ApplicayionComponenet {
        return component
    }

}