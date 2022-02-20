package com.acsoft.myexpenses.repository

import com.acsoft.myexpenses.data.model.Expense

interface ExpenseRepository {

    fun getAllExpenses() : List<Expense>

    fun insertExpenses(expense: Expense)
}