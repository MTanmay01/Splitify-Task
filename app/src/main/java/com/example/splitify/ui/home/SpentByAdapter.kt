package com.example.splitify.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.splitify.databinding.SpentByItemViewBinding
import com.example.splitify.models.UserExpense
import com.example.splitify.models.userExpenseDummyData

class SpentByAdapter(
    private val expenseList: List<UserExpense> = userExpenseDummyData()
) : RecyclerView.Adapter<SpentByViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SpentByViewHolder {
        val itemBinding = SpentByItemViewBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return SpentByViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: SpentByViewHolder, position: Int) {
        holder.bind(expenseList[position])
    }

    override fun getItemCount(): Int = expenseList.size
}