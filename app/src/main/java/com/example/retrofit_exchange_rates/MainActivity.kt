package com.example.retrofit_exchange_rates

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


const val BASE_URL = "https://cdn.cur.su/api/"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getMyData();
    }

    private fun getMyData() {
        val retrofitBuilder = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
            .create(ApiInterface::class.java)

        val retrofitData = retrofitBuilder.getData()

        retrofitData.enqueue(object : Callback<List<Rates>?> {
            override fun onResponse(call: Call<List<Rates>?>, response: Response<List<Rates>?>) {

                val responseBody = response

                val myStringBuilder = StringBuilder()

                myStringBuilder.append("RUB" + responseBody)

//                for (myData in responseBody){
//                    myStringBuilder.append("RUB" + myData.rUB)
//                    myStringBuilder.append("\n")
//                }
//
//                val responseBody = response.body()!!
//
//                val myStringBuilder = StringBuilder()
//                for (myData in responseBody){
//                    myStringBuilder.append("RUB" + myData.rUB)
//                    myStringBuilder.append("\n")
//                }
                act_main.text = myStringBuilder
            }

            override fun onFailure(call: Call<List<Rates>?>, t: Throwable) {
                Log.d("MainActivity","onFailure"+t.message)
            }
        })
    }
}