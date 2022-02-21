package com.example.academy_lis_m.main.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.academy_lis_m.main.domain.User
import com.example.academy_lis_m.main.domain.UserRepository
import kotlin.random.Random

object UserRepositoryImpl : UserRepository {


    private val listUserLiveData = MutableLiveData<List<User>>()

    //сортування списку (компаратор) ({p0, p1 -> p0.id.compareTo(p1.id)}) по ід
    private val userList = sortedSetOf<User>({ p0, p1 -> p0.id.compareTo(p1.id) })

    private var autoIncrementId = 0

    //список (заповнення списка даними)
    init {
        for (i in 0 until 5) {
            val item = User("Login $i", "$i", "Name $i", Random.nextBoolean())
            addUserItem(item)
        }
    }

    override fun addUserItem(user: User) {
        if (user.id == User.UNDEF_ID) {
            user.id = autoIncrementId++
        }
        userList.add(user)
        updateList()
    }

    override fun deleteUserItem(user: User) {
        userList.remove(user)
        updateList()
    }

    override fun editUserItem(user: User) {
        val oldUser = idUserItem(user.id)
        userList.remove(oldUser)
        addUserItem(user)
    }

    override fun idUserItem(userItemId: Int): User {
        return userList.find {
            it.id == userItemId
        } ?: throw RuntimeException("id $userItemId not found")
    }

    override fun getUserList(): LiveData<List<User>> {
        return listUserLiveData
    }

    fun updateList() {
        listUserLiveData.value = userList.toList()
    }
}