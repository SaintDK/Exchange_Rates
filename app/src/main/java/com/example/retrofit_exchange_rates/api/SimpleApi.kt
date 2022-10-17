package com.example.retrofit_exchange_rates.api

import com.example.retrofit_exchange_rates.model.Post
import retrofit2.http.GET

interface SimpleApi {

    @GET("api/latest.json")
    suspend fun getPost(): Post

}