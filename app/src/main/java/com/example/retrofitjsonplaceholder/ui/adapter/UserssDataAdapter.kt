package com.example.retrofitjsonplaceholder.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

import androidx.viewpager2.widget.ViewPager2
import com.example.retrofitjsonplaceholder.R
import com.example.retrofitjsonplaceholder.retrofits.userssData

class UserssDataAdapter(private val mContext:Context, private val DGUssersDataList:List<userssData?>):RecyclerView.Adapter<UserssDataAdapter.CardNesneleriniTutucu>() {

    inner class CardNesneleriniTutucu(view:View):RecyclerView.ViewHolder(view){
        var cardView: CardView
        var viewPager : ViewPager2
        var textViewAdı : TextView
        var textViewKullaniciAdi : TextView
        var textViewMail : TextView

        init {
            cardView = view.findViewById(R.id.satirCard)
            viewPager = view.findViewById(R.id.viewPager)
            textViewAdı = view.findViewById(R.id.textViewAdı)
            textViewKullaniciAdi = view.findViewById(R.id.textViewKullaniciAdi)
            textViewMail = view.findViewById(R.id.textViewMail)

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardNesneleriniTutucu {
        val tasarim = LayoutInflater.from(mContext).inflate(R.layout.card_tasarim,parent,false)
        return CardNesneleriniTutucu(tasarim)
    }

    override fun getItemCount(): Int {
        return DGUssersDataList.size
    }

    override fun onBindViewHolder(holder: CardNesneleriniTutucu, position: Int) {
        val ussersData = DGUssersDataList[position]
        holder.textViewAdı.text = ussersData?.name
        holder.textViewKullaniciAdi.text = ussersData?.username
        holder.textViewMail.text = ussersData?.email

        holder.cardView.setOnClickListener {
            Toast.makeText(mContext,"${ussersData?.id}. id - ${ussersData?.username} kullanıcı seçildi",Toast.LENGTH_SHORT).show()
        }
    }


}