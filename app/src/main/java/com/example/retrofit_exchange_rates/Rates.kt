package com.example.retrofit_exchange_rates


import com.google.gson.annotations.SerializedName

data class Rates(
    @SerializedName("lastupdate")
    val lastupdate: String,
    @SerializedName("rates")
    val rates: RatesX,
    @SerializedName("table")
    val table: String
)