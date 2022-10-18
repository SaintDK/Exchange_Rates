package com.aarafrao.yttutorial_2

import com.example.retrofit_exchange_rates.User
import retrofit2.Response
import retrofit2.http.GET

interface ApiInterface {

    @GET("users")
    suspend fun getUsers():Response<User>
}