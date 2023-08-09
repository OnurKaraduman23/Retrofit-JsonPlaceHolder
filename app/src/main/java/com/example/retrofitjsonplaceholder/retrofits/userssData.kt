package com.example.retrofitjsonplaceholder.retrofits

class userssData {


        val website: String?=null
        val address: Address?=null
        val phone: String?=null
        val name: String?=null
        val company: Company?=null
        val id: Long?=null
        val email: String?=null
        val username: String?=null


        data class Address(
            val zipcode: String,
            val geo: Geo,
            val suite: String,
            val city: String,
            val street: String

        )
        data class Geo(
            val lng: String,
            val lat: String
        )

        data class Company(
            val bs: String,
            val catchPhrase: String,
            val name: String
        )
    }

