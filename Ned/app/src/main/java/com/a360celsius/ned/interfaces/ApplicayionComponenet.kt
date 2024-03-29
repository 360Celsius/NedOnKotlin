package com.a360celsius.ned.interfaces

import com.a360celsius.ned.base.BaseActivity
import com.a360celsius.ned.modules.ContextApplicationModule
import com.a360celsius.ned.modules.ApiServiceModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component (modules = [ContextApplicationModule::class, ApiServiceModule::class])
interface ApplicayionComponenet {
    fun inject(target: BaseActivity)
}