package com.example.retrofit_exchange_rates

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.retrofit_exchange_rates.model.Post
import com.example.retrofit_exchange_rates.model.Rates
import com.example.retrofit_exchange_rates.repository.Repository
import kotlinx.coroutines.launch

class MainViewModel(private val repository: Repository): ViewModel() {

    val myResponse: MutableLiveData<Post> = MutableLiveData()

    fun getPost(){
        viewModelScope.launch{
            val response = repository.getPost()
            myResponse.value = response
        }
    }

}