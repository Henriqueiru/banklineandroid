package me.dio.bankline_android.data

sealed class State<out T>{
    data class Success<out R>(val data: R? = null) : State<R?>()
    data class Erro(val message: String? = null) : State<Nothing>()
    object Wait: State<Nothing>()
}
