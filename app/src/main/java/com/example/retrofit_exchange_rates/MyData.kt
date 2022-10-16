package com.example.retrofit_exchange_rates


import com.google.gson.annotations.SerializedName

data class MyData(
    @SerializedName("lastupdate")
    val lastupdate: String,
    @SerializedName("rates")
    val rates: Rates,
    @SerializedName("table")
    val table: String
)