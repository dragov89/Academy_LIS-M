package com.example.academy_lis_m.main.domain

class IdUserItemUseCese(private val userRepository: UserRepository) {
    fun idUserItem(userItemId: Int): User {
        return userRepository.idUserItem(userItemId)
    }
}