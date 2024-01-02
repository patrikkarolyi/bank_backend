package com.example.user.domain.repository

import com.example.user.domain.User
import org.springframework.data.mongodb.repository.MongoRepository

interface UserRepository : MongoRepository<User, Long>