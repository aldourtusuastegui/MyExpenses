package com.acsoft.myexpenses.repository

import com.acsoft.myexpenses.data.local.LocalExpenseDataSource
import com.acsoft.myexpenses.data.model.Expense
import dagger.hilt.android.scopes.ActivityRetainedScoped
import kotlinx.coroutines.ExperimentalCoroutinesApi
import javax.inject.Inject

@ExperimentalCoroutinesApi
@ActivityRetainedScoped
class ExpenseRepositoryImpl @Inject constructor(
    private val localExpenseDataSource: LocalExpenseDataSource
) : ExpenseRepository {

    override fun getAllExpenses(): List<Expense> {
        return localExpenseDataSource.getAllExpenses()
    }

    override suspend fun insertExpenses(expense: Expense) {
        localExpenseDataSource.insertExpense(expense)
    }

}