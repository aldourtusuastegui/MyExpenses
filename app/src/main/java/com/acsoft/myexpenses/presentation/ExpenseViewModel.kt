package com.acsoft.myexpenses.presentation

import androidx.hilt.Assisted
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.acsoft.myexpenses.data.model.Expense
import com.acsoft.myexpenses.repository.ExpenseRepository
import kotlinx.coroutines.launch

class ExpenseViewModel @ViewModelInject constructor(
    private val repository: ExpenseRepository,
    @Assisted private val savedStateHandle: SavedStateHandle
) : ViewModel() {

    fun insertExpense(expense: Expense) {

        viewModelScope.launch {
            repository.insertExpenses(expense)
        }
    }

}