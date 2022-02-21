package com.example.academy_lis_m.main.domain

class AddUserUseCese(private val userRepository: UserRepository) {
    fun addUserItem(user: User){
        userRepository.addUserItem(user)

    }
}