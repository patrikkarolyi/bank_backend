package com.example.transactions.data

import com.example.transactions.api.model.Transaction
import org.springframework.data.mongodb.repository.MongoRepository

interface TransactionRepository : MongoRepository<Transaction, String> {
}