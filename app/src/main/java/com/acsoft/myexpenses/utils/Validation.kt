package com.acsoft.myexpenses.utils

object Validation {

    fun validateTitleInput(title: String) : Boolean {
        return (title.isNotEmpty() && title.length<30)
    }

    fun validateAmountInput(amount : String) : Boolean {
      return (amount.isNotEmpty() && amount.toDouble()>0)
    }
}