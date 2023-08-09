package com.example.retrofitjsonplaceholder.retrofits

import android.util.Log
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient1 {

    val BASE_URL = "https://jsonplaceholder.typicode.com/"
    private var retrofit : Retrofit? = null

    val client:Retrofit?
        get() {
            if (retrofit == null){ //retrofit oluşturulmamışs oluştur
                Log.e("Dante","retrofit Oluşturuldu")
                retrofit = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()

            }

            return retrofit
        }

}