package com.example.academy_lis_m.main.domain.use_case

import com.example.academy_lis_m.main.domain.repository.RegisterRepository

class RegisterUser(private val repositiry: RegisterRepository) {
    fun register(login: String, pass: String): Boolean{
        return repositiry.register(login,pass)
    }
}