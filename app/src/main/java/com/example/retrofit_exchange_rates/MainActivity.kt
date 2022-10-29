package com.example.retrofit_exchange_rates

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.example.retrofit_exchange_rates.ApiInterface
import com.example.retrofit_exchange_rates.Utils
import com.example.retrofit_exchange_rates.R
import com.example.retrofit_exchange_rates.Utils.BASE_URL
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import org.json.JSONObject

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val user = Utils.getInstance().create(ApiInterface::class.java)

        GlobalScope.launch {
            val results = user.getUsers()
            if (results.body()!=null){

                Log.d("TAG", "onCreate: ${results.body()}")

//                text1.text =

            }
        }

    }

    private fun parseUserItem(result: String){


        val mainObject = JSONObject(result)
        val item = UserItem(
            mainObject.getJSONObject("first").getString("url"),
        )
        Log.d("TAG1", "targets: ${item.avatar_url}")

    }

}