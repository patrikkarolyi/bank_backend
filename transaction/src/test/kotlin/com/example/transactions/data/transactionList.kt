package com.example.transactions.data

import com.example.transactions.api.model.Transaction

val transactionList = listOf(
    Transaction(
        id = 0,
        idTo = 123L,
        idFrom = 456L,
        amount = 1000,
        timestamp = System.currentTimeMillis()
    )
)