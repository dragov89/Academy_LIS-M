package com.example.academy_lis_m.main.domain.use_case

import com.example.academy_lis_m.main.domain.User
import com.example.academy_lis_m.main.domain.repository.RegisterRepository

class DeleteUser(private val repositiry: RegisterRepository) {
    fun deleteUser(user: User) {
        repositiry.deleteUser(user)
    }
}