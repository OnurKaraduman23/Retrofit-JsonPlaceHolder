package com.example.retrofitjsonplaceholder.ui.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.retrofitjsonplaceholder.R
import com.example.retrofitjsonplaceholder.databinding.FragmentAnasayfaBinding
import com.example.retrofitjsonplaceholder.retrofits.ApiClient1
import com.example.retrofitjsonplaceholder.retrofits.ApiInterface1
import com.example.retrofitjsonplaceholder.ui.adapter.UserssDataAdapter
import com.example.retrofitjsonplaceholder.retrofits.userssData
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class AnasayfaFragment : Fragment() {
    private lateinit var tasarimBinding: FragmentAnasayfaBinding
    private lateinit var adapter : UserssDataAdapter
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        tasarimBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_anasayfa,container,false)

        var gelenVeri : List<userssData?> ?=null


        tasarimBinding.rv.setHasFixedSize(true)
        tasarimBinding.rv.layoutManager = LinearLayoutManager(requireContext(),LinearLayoutManager.VERTICAL,false)


        var apiInterface1 = ApiClient1.client?.create(ApiInterface1::class.java)
        var apiCall=apiInterface1?.tumKullanicilariGetir()
        Log.e("Dante","Burada")
        apiCall?.enqueue(object : Callback<List<userssData>> {
            override fun onResponse(
                call: Call<List<userssData>>,
                response: Response<List<userssData>>
            ) {
                Log.e("Dante", "BAŞARILI")
                gelenVeri = response.body()
                adapter = UserssDataAdapter(requireContext(),gelenVeri!!)
                tasarimBinding.rv.adapter = adapter

            }

            override fun onFailure(call: Call<List<userssData>>, t: Throwable) {
                Log.e("Dante", t?.printStackTrace().toString())
            }


        })


        return tasarimBinding.root
    }


}