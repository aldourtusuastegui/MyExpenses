package com.acsoft.myexpenses.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.acsoft.myexpenses.data.model.Expense

@Database(entities = [Expense::class], version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun ExpenseDao(): ExpenseDao

    companion object {

        private var INSTANCE: AppDatabase? = null

        fun  getDatabase(context: Context) : AppDatabase {
            INSTANCE = INSTANCE ?: Room.databaseBuilder(
                context.applicationContext,
                AppDatabase::class.java,
                "database")
                .build()

            return  INSTANCE!!
        }

        fun destroyInstance() {
            INSTANCE = null
        }

    }

}