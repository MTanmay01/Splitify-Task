package com.example.splitify.ui.history

import android.graphics.Typeface
import android.text.SpannableString
import android.text.Spanned
import android.text.style.ForegroundColorSpan
import android.text.style.StyleSpan
import androidx.recyclerview.widget.RecyclerView
import com.example.splitify.R
import com.example.splitify.databinding.ExpenseListItemBinding
import com.example.splitify.models.ExpenseHistory

class ExpenseViewHolder(
    private val binding: ExpenseListItemBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(item: ExpenseHistory) {
        binding.apply {
            expenseName.text = item.expenseName
            usernameTv.text = item.username
            expenseTimeTv.text = item.expenseTime

            val expenseAmountText = "Rs " + item.amount
            val blueColorSpan = ForegroundColorSpan(
                binding.root.context.resources.getColor(R.color.blue)
            )
            val greyColorSpan = ForegroundColorSpan(
                binding.root.context.resources.getColor(R.color.grey)
            )
            val boldStyleSpan = StyleSpan(Typeface.BOLD)

            val expenseAmountSpan = SpannableString(expenseAmountText)
            expenseAmountSpan.setSpan(greyColorSpan, 0, 2, Spanned.SPAN_INCLUSIVE_INCLUSIVE)
            expenseAmountSpan.setSpan(blueColorSpan, 3, expenseAmountText.length, Spanned.SPAN_INCLUSIVE_INCLUSIVE)
            expenseAmountSpan.setSpan(boldStyleSpan, 3, expenseAmountText.length, Spanned.SPAN_INCLUSIVE_INCLUSIVE)

            expenseAmountTv.text = expenseAmountSpan
        }
    }
}