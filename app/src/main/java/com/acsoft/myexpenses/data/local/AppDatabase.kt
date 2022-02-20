package com.acsoft.myexpenses.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.acsoft.myexpenses.data.model.Expense

@Database(entities = [Expense::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun ExpenseDao(): ExpenseDao
}