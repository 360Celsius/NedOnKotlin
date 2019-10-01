package com.a360celsius.ned.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import om.a360celsius.ned.utils.API_BASER_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

open class BaseActivity : AppCompatActivity(){

    lateinit var retrofit: Retrofit

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        retrofit = Retrofit.Builder()
            .baseUrl(API_BASER_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}