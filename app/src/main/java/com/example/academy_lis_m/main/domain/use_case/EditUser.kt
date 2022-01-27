package com.example.academy_lis_m.main.domain.use_case

import com.example.academy_lis_m.main.domain.User
import com.example.academy_lis_m.main.domain.repository.RegisterRepository

class EditUser(private val repositiry: RegisterRepository) {
    fun editUser(user: User){
        repositiry.editUser(user)
    }
}