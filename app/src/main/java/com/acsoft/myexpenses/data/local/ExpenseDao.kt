package com.acsoft.myexpenses.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.acsoft.myexpenses.data.model.Expense

@Dao
interface ExpenseDao {

    @Query("SELECT * FROM Expense")
    fun getAllExpenses() : List<Expense>

    @Insert
    fun insertExpense(expense: Expense)

}