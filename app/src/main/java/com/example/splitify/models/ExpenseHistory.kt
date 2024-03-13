package com.example.splitify.models

data class ExpenseHistory(
    val expenseName: String,
    val username: String,
    val amount: Int,
    val expenseTime: String
)

fun expenseHistoryDummyData() = listOf(
    ExpenseHistory("Dinner", "Tanmay", 300000, "13-03-2024 00:19"),
    ExpenseHistory("Bills", "Aditi Sharma", 5000, "12-03-2024 00:04"),
    ExpenseHistory("Salary", "hilary", 100000, "10-03-2024 20:54")
)
