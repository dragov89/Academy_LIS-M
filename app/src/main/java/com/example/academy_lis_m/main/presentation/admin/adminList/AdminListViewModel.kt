package com.example.academy_lis_m.main.presentation.admin.adminList

import androidx.lifecycle.ViewModel
import com.example.academy_lis_m.main.data.UserRepositoryImpl
import com.example.academy_lis_m.main.domain.EditUserUseCese
import com.example.academy_lis_m.main.domain.GetUserListUseCese
import com.example.academy_lis_m.main.domain.User

class AdminListViewModel : ViewModel() {
    private val repository = UserRepositoryImpl

    private val getUserListUseCase = GetUserListUseCese(repository)
    private val editUserUseCase = EditUserUseCese(repository)

    val userList = getUserListUseCase.getUserList()

    fun editUserStatus(user: User) {
        val newItem = user.copy(status = !user.status)
        editUserUseCase.editUserItem(newItem)
    }


}