package com.example.user.domain

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "users")
data class User(
        @Id
        val id: Int,
        val name: String,
        val age: Int,
        val email: String
)