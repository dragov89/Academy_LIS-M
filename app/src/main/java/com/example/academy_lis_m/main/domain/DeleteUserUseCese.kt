package com.example.academy_lis_m.main.domain

class DeleteUserUseCese(private val userRepository: UserRepository) {
 fun deleteUserItem(user: User){
  userRepository.deleteUserItem(user)

 }
}