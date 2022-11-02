package com.example.retrofit_exchange_rates.repository

import com.example.retrofit_exchange_rates.api.RetrofitInstance
import com.example.retrofit_exchange_rates.model.Rates

class Repository {

    suspend fun getPost(): Rates {
        return RetrofitInstance.api.getPost()
    }

}