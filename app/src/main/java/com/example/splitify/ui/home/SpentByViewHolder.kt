package com.example.splitify.ui.home

import androidx.recyclerview.widget.RecyclerView
import com.example.splitify.databinding.SpentByItemViewBinding
import com.example.splitify.models.UserExpense

class SpentByViewHolder(
    private val item: SpentByItemViewBinding
) : RecyclerView.ViewHolder(item.root) {

    fun bind(user: UserExpense) {
        item.apply {
            userNameTv.text = user.username
            amountSpentTv.text = user.amount.toString()
        }
    }

}