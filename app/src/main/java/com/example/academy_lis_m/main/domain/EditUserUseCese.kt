package com.example.academy_lis_m.main.domain

class EditUserUseCese(private val userRepository: UserRepository) {
//    fun editShopItem(name: String, count: Int) {
//    }
    fun editUserItem(user: User){
        userRepository.editUserItem(user)
    }
}