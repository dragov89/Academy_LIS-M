package com.example.academy_lis_m.main.domain
data class User(
    val login:String,
    val password:String,
    val name:String,
    var status:Boolean= true,
    var yer:Int = DEF_YER,
    var id:Int = UNDEF_ID
){
    companion object{
        const val UNDEF_ID = -1
        const val DEF_YER = 99
    }
}
