package com.acsoft.myexpenses

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.acsoft.myexpenses.data.model.Expense
import com.acsoft.myexpenses.databinding.ActivityMainBinding
import com.acsoft.myexpenses.presentation.ExpenseViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

       /* val expenseViewModel : ExpenseViewModel by viewModels()
        val expense = Expense(1,"beer",100.0)
        expenseViewModel.insertExpense(expense)
*/
    }
}