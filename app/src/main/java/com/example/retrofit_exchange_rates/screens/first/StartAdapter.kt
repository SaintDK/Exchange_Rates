package com.example.retrofit_exchange_rates.screens.first

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.retrofit_exchange_rates.R
import com.example.retrofit_exchange_rates.model.cash.Cash
import kotlinx.android.synthetic.main.item_money_layout.view.*

class StartAdapter : RecyclerView.Adapter<StartAdapter.StartViewHolder>(){

    var listStart = emptyList<Cash>()

    class StartViewHolder(view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StartViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_money_layout, parent, false)
        return StartViewHolder(view)
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: StartViewHolder, position: Int) {
        holder.itemView.item_name.text = listStart[position].rates.toString()
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return listStart.size
        TODO("Not yet implemented")
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setList(list: List<Cash>){
        listStart = list
        notifyDataSetChanged()
    }
}