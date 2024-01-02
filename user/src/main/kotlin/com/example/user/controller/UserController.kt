package com.example.user.controller

import com.example.user.domain.User
import com.example.user.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/account")
class UserController @Autowired constructor(
    private val userService: UserService
) {
    @GetMapping("/users")
    fun getAccounts(): List<User> {
        return userService.getUsers()
    }

    @GetMapping("/user/{id}")
    fun getAccount(@PathVariable id: Long): ResponseEntity<User> {
        val user = userService.getUser(id) ?: return ResponseEntity.notFound().build()
        return ResponseEntity.ok(user)
    }

    @PostMapping("/create")
    fun postCreateAccount(@RequestBody user: User): ResponseEntity<User>{
        userService.createUser(user)
        return ResponseEntity.ok(user)
    }

    @GetMapping("/balance")
    fun getBalance(@RequestParam userId: Int) {

    }

    @GetMapping("/transactions")
    fun getLatestTransactions(@RequestParam userId: Int) {

    }
}