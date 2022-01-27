package com.example.academy_lis_m.main.domain.use_case

import com.example.academy_lis_m.main.domain.User
import com.example.academy_lis_m.main.domain.repository.RegisterRepository

class GetUserList(private val repositiry: RegisterRepository) {
    fun getUserList(): List<User>{
        return repositiry.getUserList()
    }
}