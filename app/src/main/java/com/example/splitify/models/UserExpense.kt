package com.example.splitify.models

data class UserExpense(
    val username: String,
    val amount: Int
)

fun userExpenseDummyData() = listOf(
    UserExpense("Aditi Sharma", 5000),
    UserExpense("Hareesh K", 0),
    UserExpense("Moksh", 0),
    UserExpense("Nitish Sharma", 0),
    UserExpense("Prem", 0),
    UserExpense("Shweta kachan", 0),
    UserExpense("Tanmay", 300000),
    UserExpense("ayushh", 0),
    UserExpense("hilary", 100000),
)