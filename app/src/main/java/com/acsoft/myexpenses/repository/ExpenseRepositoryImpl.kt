package com.acsoft.myexpenses.repository

import com.acsoft.myexpenses.data.local.LocalExpenseDataSource
import com.acsoft.myexpenses.data.model.Expense

class ExpenseRepositoryImpl(private val localDataSource: LocalExpenseDataSource) : ExpenseRepository {

    override fun getAllExpenses(): List<Expense> {
        return localDataSource.getAllExpenses()
    }

    override fun insertExpenses(expense: Expense) {
        localDataSource.insertExpense(expense)
    }

}