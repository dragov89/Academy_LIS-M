package com.example.academy_lis_m.main.domain.repository

import com.example.academy_lis_m.main.domain.User
import kotlinx.coroutines.flow.Flow

interface RegisterRepository {

    fun register(login: String, pass: String): Boolean

    fun addUser(user: User)

    fun deleteUser(user: User)

    fun editUser(user: User)

    fun getUser(userId: Int): User

    fun getUserList(): List<User>

}