package com.acsoft.myexpenses.repository

import com.acsoft.myexpenses.data.model.Expense

interface ExpenseRepository {

    fun getAllExpenses() : List<Expense>

    suspend fun insertExpenses(expense: Expense)
}