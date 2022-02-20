package com.acsoft.myexpenses.data.local

import com.acsoft.myexpenses.data.model.Expense

class LocalExpenseDataSource(private val expenseDao: ExpenseDao) {

    fun getAllExpenses() : List<Expense> {
        return expenseDao.getAllExpenses()
    }

    fun insertExpense(expense: Expense) {
        expenseDao.insertExpense(expense)
    }

}