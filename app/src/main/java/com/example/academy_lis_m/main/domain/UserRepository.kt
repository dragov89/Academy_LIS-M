package com.example.academy_lis_m.main.domain
import androidx.lifecycle.LiveData

interface UserRepository {
    fun addUserItem(user: User)
    fun deleteUserItem(user: User)
    fun editUserItem(user: User)
    fun idUserItem(userItemId: Int):User
    fun getUserList():LiveData<List<User>>


}