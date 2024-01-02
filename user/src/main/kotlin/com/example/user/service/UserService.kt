package com.example.user.service

import com.example.user.domain.User
import com.example.user.domain.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(private val userRepository: UserRepository) {

    fun getUser(id: Long): User? {
        return userRepository.findById(id).orElse(null)
    }

    fun createUser(user: User): User {
        return userRepository.insert(user)
    }

    fun getUsers(): List<User> {
        return userRepository.findAll()
    }
}