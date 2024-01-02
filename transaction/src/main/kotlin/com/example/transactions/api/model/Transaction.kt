package com.example.transactions.api.model

data class Transaction(
    val id: Long,
    val idTo: Long,
    val idFrom: Long,
    val amount: Int,
    val timestamp: Long,
)