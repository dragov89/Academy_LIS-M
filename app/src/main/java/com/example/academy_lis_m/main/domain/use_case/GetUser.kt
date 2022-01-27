package com.example.academy_lis_m.main.domain.use_case

import com.example.academy_lis_m.main.domain.User
import com.example.academy_lis_m.main.domain.repository.RegisterRepository

class GetUser(private val repositiry: RegisterRepository) {
    fun getUser(userId: Int): User{
        return repositiry.getUser(userId)
    }

}