package com.example.user.service

import com.example.user.domain.User
import com.example.user.domain.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(private val userRepository: UserRepository) {

    fun getUser(id: Long): User? {
        return null
    }

    fun createUser(user: User): User {
        return user
    }

    fun getUsers(): List<User> {
        return emptyList()
    }
}