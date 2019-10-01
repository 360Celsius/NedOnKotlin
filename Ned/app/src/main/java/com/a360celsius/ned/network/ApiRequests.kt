package com.a360celsius.ned.network

import com.a360celsius.ned.network.responcedataclases.Symbol
import retrofit2.Call
import retrofit2.http.GET

interface ApiRequests {

    @GET("ref-data/symbols")
    fun getAllAvailableSymbols(): Call<List<Symbol>>

}