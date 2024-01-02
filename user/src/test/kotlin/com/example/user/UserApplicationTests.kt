package com.example.user

import com.example.user.domain.User
import com.example.user.domain.repository.UserRepository
import com.example.user.service.UserService
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class UserApplicationTests {

	@Test
	fun getAllUsers() {

		//Given
		val mockUserData = mockk<List<User>>()
		val mockRepository = mockk<UserRepository>()
		val userService = UserService(mockRepository)

		every { mockRepository.findAll() } answers { mockUserData }

		//When
		val users = userService.getUsers()

		//Then
		verify { mockRepository.findAll() }
		assertEquals(users, mockUserData)
	}

	@Test
	fun createUser() {

		//Given
		val mockUserData = mockk<User>()
		val mockRepository = mockk<UserRepository>()
		val userService = UserService(mockRepository)

		every { mockRepository.insert(mockUserData) } answers { mockUserData }

		//When
		val user = userService.createUser(mockUserData)

		//Then
		verify { mockRepository.insert(mockUserData) }
		assertEquals(user, mockUserData)
	}

}


