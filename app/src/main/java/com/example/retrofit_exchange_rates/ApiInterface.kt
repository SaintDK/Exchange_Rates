package com.example.retrofit_exchange_rates

import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

    @GET("latest.json")
    fun getData(): Call<List<Rates>>

}