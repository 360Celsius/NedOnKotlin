package com.a360celsius.ned.interfaces

import com.a360celsius.ned.base.BaseActivity
import com.a360celsius.ned.modules.ContextApplicationModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component (modules = [ContextApplicationModule::class])
interface ApplicayionComponenet {
    fun inject(target: BaseActivity)
}