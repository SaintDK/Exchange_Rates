package com.example.retrofit_exchange_rates.repository

import com.example.retrofit_exchange_rates.api.RetrofitInstance
import com.example.retrofit_exchange_rates.model.Post
import okhttp3.Response

class Repository {


    suspend fun getPost(): Post {
        return RetrofitInstance.api.getPost()
    }

}

