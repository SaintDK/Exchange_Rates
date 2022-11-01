package com.example.retrofit_exchange_rates

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Utils {
    var BASE_URL = "https://cdn.cur.su/api/latest.json/"

    fun getInstance():Retrofit{
        return Retrofit.Builder().baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}