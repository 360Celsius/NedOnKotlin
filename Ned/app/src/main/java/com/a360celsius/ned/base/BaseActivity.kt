package com.a360celsius.ned.base

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.a360celsius.ned.application.NedApplication
import com.a360celsius.ned.datamodels.Symbol
import com.a360celsius.ned.interfaces.ApiServiceInterface
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import javax.inject.Inject


open class BaseActivity: AppCompatActivity() {

    @Inject
    lateinit var contextApplicationModule: Context

    @Inject
    lateinit var apiService: Retrofit

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        (application as NedApplication).getComponent().inject(this)


        apiService.create(ApiServiceInterface::class.java).getAllSymbols().enqueue(object: Callback<List<Symbol>> {
            override fun onResponse(call: Call<List<Symbol>>, response: Response<List<Symbol>>) {

                Log.e("test","yes")
            }

            override fun onFailure(call: Call<List<Symbol>>, t: Throwable) {
                Log.e("test","no")
            }

        })
    }
}