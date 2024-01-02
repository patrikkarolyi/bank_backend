package com.example.transactions.api.controller

import com.example.transactions.api.model.Transaction
import com.example.transactions.service.TransactionService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/transaction")
class TransactionController @Autowired constructor(
    private val transactionService: TransactionService
) {
    @GetMapping("/list")
    fun getTransactions(): List<Transaction> {
        return transactionService.getTransactions()
    }

    @PostMapping("/deposit")
    fun postDeposit(){

    }

    @PostMapping("/withdraw")
    fun postWithdraw(){

    }
}