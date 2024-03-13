package com.example.splitify.ui.history

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.splitify.databinding.ExpenseListItemBinding
import com.example.splitify.models.ExpenseHistory
import com.example.splitify.models.expenseHistoryDummyData

class ExpenseAdapter(
    private val expenseList: List<ExpenseHistory> = expenseHistoryDummyData()
) : RecyclerView.Adapter<ExpenseViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExpenseViewHolder {
        val binding = ExpenseListItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ExpenseViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ExpenseViewHolder, position: Int) {
        holder.bind(expenseList[position])
    }

    override fun getItemCount(): Int = expenseList.size
}