package com.example.retrofit_exchange_rates


import com.google.gson.annotations.SerializedName

data class User(
    @SerializedName("lastupdate")
    val lastupdate: String,
    @SerializedName("rates")
    val rates: UserItem,
    @SerializedName("table")
    val table: String
)