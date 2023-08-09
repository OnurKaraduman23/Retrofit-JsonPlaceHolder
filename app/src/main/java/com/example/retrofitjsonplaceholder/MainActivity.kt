package com.example.retrofitjsonplaceholder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import com.example.retrofitjsonplaceholder.databinding.ActivityMainBinding
import com.example.retrofitjsonplaceholder.retrofits.ApiClient1
import com.example.retrofitjsonplaceholder.retrofits.ApiInterface1
import com.example.retrofitjsonplaceholder.retrofits.userssData


import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    private  lateinit var tasarim:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = DataBindingUtil.setContentView(this@MainActivity,R.layout.activity_main)





    }
}