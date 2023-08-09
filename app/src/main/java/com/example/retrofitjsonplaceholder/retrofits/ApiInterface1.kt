package com.example.retrofitjsonplaceholder.retrofits


import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface1 {

    //kullanıcılar
    @GET("users")
    fun tumKullanicilariGetir(): Call<List<userssData>>

}