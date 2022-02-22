package com.acsoft.myexpenses.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.acsoft.myexpenses.data.model.Expense

class FakeExpenseRepository : ExpenseRepository {

    private val expensesList = mutableListOf<Expense>()

    private val observableExpensesList = MutableLiveData<List<Expense>>(expensesList)

    private fun refreshLiveData() {
        observableExpensesList.postValue(expensesList)
    }

    override fun getAllExpenses(): LiveData<List<Expense>> {
        return observableExpensesList
    }

    override suspend fun insertExpenses(expense: Expense) {
        expensesList.add(expense)
        refreshLiveData()
    }
}