package com.a360celsius.ned

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.a360celsius.ned.base.BaseActivity
import com.a360celsius.ned.network.ApiRequests
import com.a360celsius.ned.network.responcedataclases.Symbol
import om.a360celsius.ned.utils.API_BASER_URL
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class SplashActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)


        val service = retrofit.create(ApiRequests::class.java)
        val call = service.getAllAvailableSymbols()
        call.enqueue(object :Callback <List<Symbol>>{
            override fun onFailure(call: Call<List<Symbol>>, t: Throwable) {
                Log.e("test","error")
            }

            override fun onResponse(call: Call<List<Symbol>>, response: Response<List<Symbol>>) {
                Log.e("test","responce")
            }


        })


    }
}
