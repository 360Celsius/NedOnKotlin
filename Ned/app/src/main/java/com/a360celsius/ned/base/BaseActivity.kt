package com.a360celsius.ned.base

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.a360celsius.ned.application.App
import com.a360celsius.ned.network.ApiService
import retrofit2.Retrofit
import javax.inject.Inject


open class BaseActivity: AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        (application as App).getComponent().inject(this)


    }
}