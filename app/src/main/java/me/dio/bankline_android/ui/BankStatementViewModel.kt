package me.dio.bankline_android.ui

import androidx.lifecycle.ViewModel
import me.dio.bankline_android.data.BanklineRepository

class BankStatementViewModel : ViewModel (){

    fun findBankStatement(accountHolderId: Int) =
        BanklineRepository.findBankStatement(accountHolderId)
}