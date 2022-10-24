package com.example.retrofit_exchange_rates

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.retrofit_exchange_rates.API.ApiInterface
import com.aarafrao.yttutorial_2.Utils
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val user = Utils.getInstance().create(ApiInterface::class.java)



        GlobalScope.launch {

            val results = user.getUsers()

            Log.d("Unnamed-0","answer: ${results.body()}")

        }



    }
}



