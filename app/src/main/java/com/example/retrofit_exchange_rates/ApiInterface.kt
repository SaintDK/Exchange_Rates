package com.example.retrofit_exchange_rates


import retrofit2.Response
import retrofit2.http.GET

interface ApiInterface {

    @GET("users")
    suspend fun getUsers():Response<User>
}