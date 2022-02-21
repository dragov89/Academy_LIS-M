package com.example.academy_lis_m.main.domain
import androidx.lifecycle.LiveData

class GetUserListUseCese(private val userRepository: UserRepository) {
    fun getUserList(): LiveData<List<User>> {
        return userRepository.getUserList()
    }
}
