package com.acsoft.myexpenses.data.local

import androidx.lifecycle.LiveData
import com.acsoft.myexpenses.data.model.Expense
import kotlinx.coroutines.ExperimentalCoroutinesApi
import javax.inject.Inject

@ExperimentalCoroutinesApi
class LocalExpenseDataSource @Inject constructor(
    private val expenseDao: ExpenseDao
) {

    fun getAllExpenses() : LiveData<List<Expense>> {
        return expenseDao.getAllExpenses()
    }

    suspend fun insertExpense(expense: Expense) {
        expenseDao.insertExpense(expense)
    }

}