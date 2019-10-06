package com.a360celsius.ned.interfaces

import com.a360celsius.ned.datamodels.Symbol
import retrofit2.Call
import retrofit2.http.GET

interface ApiServiceInterface {

    @GET("ref-data/symbols")
    fun getAllSymbols(): Call<List<Symbol>>

}