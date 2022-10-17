package com.example.retrofit_exchange_rates.model


data class Post(

    val lastupdate: String,
    val rates: Rates,
    val table: String

)