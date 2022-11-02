package com.example.retrofit_exchange_rates.api


import com.example.retrofit_exchange_rates.model.Rates
import retrofit2.http.GET

interface SimpleApi {
    @GET("latest.json/")
    suspend fun getPost(): Rates
}