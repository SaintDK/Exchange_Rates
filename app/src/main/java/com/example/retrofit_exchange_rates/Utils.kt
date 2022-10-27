package com.example.retrofit_exchange_rates

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Utils {
    var BASE = "https://api.github.com/"

    fun getInstance():Retrofit{
        return Retrofit.Builder().baseUrl(BASE)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}