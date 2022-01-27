package com.example.academy_lis_m.main.domain

data class User(
    val id:Int,
    var admin: Boolean = false,
    val login:String,
    val password:String,
    val name:String,
    var posivnoi:String = "posivnoi",
    var patrul:String = "patrul",
    var phone:String= "+380000000000",
    val territory:String
)
