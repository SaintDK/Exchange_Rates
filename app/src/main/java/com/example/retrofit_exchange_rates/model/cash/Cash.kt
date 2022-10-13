package com.example.retrofit_exchange_rates.model.cash


import com.google.gson.annotations.SerializedName

data class Cash(
    @SerializedName("lastupdate")
    val lastupdate: String,
    @SerializedName("rates")
    val rates: Rates,
    @SerializedName("table")
    val table: String
)