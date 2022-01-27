package com.example.academy_lis_m.main.data

import com.example.academy_lis_m.main.domain.User
import com.example.academy_lis_m.main.domain.repository.RegisterRepository

object UserRepositiryImpl : RegisterRepository {

    private val userList = mutableListOf<User>()

    override fun register(login: String, pass: String): Boolean {
        return false
    }

    override fun addUser(user: User) {
        userList.add(user)
    }

    override fun deleteUser(user: User) {
        userList.remove(user)
    }

    override fun editUser(user: User) {
        val oldElement = getUser(user.id)
        userList.remove(oldElement)
        addUser(user)
    }

    override fun getUser(userId: Int): User {
        return userList.find { it.id == userId } ?: throw RuntimeException(" user null")
    }

    override fun getUserList(): List<User> {
        return userList
    }
}