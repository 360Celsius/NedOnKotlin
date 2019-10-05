package com.a360celsius.ned.base

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.a360celsius.ned.application.App
import javax.inject.Inject


open class BaseActivity: AppCompatActivity() {

    @Inject
    lateinit var context: Context

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        (application as App).getComponent().inject(this)
    }
}