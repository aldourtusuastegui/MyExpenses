package com.acsoft.myexpenses.data.local

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.SmallTest
import com.acsoft.myexpenses.data.model.Expense
import com.acsoft.myexpenses.getOrAwaitValue
import com.google.common.truth.Truth.assertThat
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runBlockingTest
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@ExperimentalCoroutinesApi
@RunWith(AndroidJUnit4::class)
@SmallTest
class ExpenseDaoTest {

    @get:Rule
    var instantTaskExcutorRule = InstantTaskExecutorRule()

    private lateinit var database : AppDatabase
    private lateinit var dao: ExpenseDao

    @Before
    fun setup() {
        database = Room.inMemoryDatabaseBuilder(
            ApplicationProvider.getApplicationContext(),
            AppDatabase::class.java
        ).allowMainThreadQueries().build()

        dao = database.ExpenseDao()
    }

    @After
    fun tearDown() {
        database.close()
    }

    @Test
    fun insertExpense() = runBlockingTest {
        val expense = Expense(id = 1,title = "Factory",amount = 352.50)
        dao.insertExpense(expense)

        val allExpensesItems = dao.getAllExpenses().getOrAwaitValue()

        assertThat(allExpensesItems).contains(expense)
    }
}