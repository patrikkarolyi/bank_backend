package com.example.transactions.service

import com.example.transactions.api.model.Transaction
import com.example.transactions.data.TransactionRepository
import org.springframework.stereotype.Service

@Service
class TransactionService(private val transactionRepository: TransactionRepository) {

    fun getTransactions(): List<Transaction> {
        return transactionRepository.findAll()
    }
}