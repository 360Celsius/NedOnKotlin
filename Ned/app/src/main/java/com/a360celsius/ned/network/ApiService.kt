package com.a360celsius.ned.network

import android.app.Application
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class ApiService {

    lateinit var retrofit: Retrofit
    val BASE_URL: String = "https://api.iextrading.com/1.0"

    @Provides
    @Singleton
    fun provideRetrofit (): Retrofit {
        retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        return retrofit
    }
}