package com.acsoft.myexpenses.repository

import androidx.lifecycle.LiveData
import com.acsoft.myexpenses.data.model.Expense

interface ExpenseRepository {

    fun getAllExpenses() : LiveData<List<Expense>>

    suspend fun insertExpenses(expense: Expense)
}