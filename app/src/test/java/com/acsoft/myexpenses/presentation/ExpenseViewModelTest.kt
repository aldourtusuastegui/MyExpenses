package com.acsoft.myexpenses.presentation

import com.acsoft.myexpenses.data.model.Expense
import com.acsoft.myexpenses.repository.FakeExpenseRepository
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class ExpenseViewModelTest {

    private lateinit var viewModel: ExpenseViewModel

    @Before
    fun setup() {
        viewModel = ExpenseViewModel(FakeExpenseRepository())
    }

    @Test
    fun insertExpenseWithEmptyFieldReturnsError() {

        viewModel.insertExpense(Expense(1,"",25.0))
    }

}