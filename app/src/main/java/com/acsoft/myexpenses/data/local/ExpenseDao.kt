package com.acsoft.myexpenses.data.local

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.acsoft.myexpenses.data.model.Expense

@Dao
interface ExpenseDao {

    @Query("SELECT * FROM Expense")
    fun getAllExpenses() : LiveData<List<Expense>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertExpense(expense: Expense)

}