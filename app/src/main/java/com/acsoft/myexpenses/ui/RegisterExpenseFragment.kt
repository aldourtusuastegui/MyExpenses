package com.acsoft.myexpenses.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.acsoft.myexpenses.R
import com.acsoft.myexpenses.data.model.Expense
import com.acsoft.myexpenses.databinding.FragmentRegisterExpenseBinding
import com.acsoft.myexpenses.presentation.ExpenseViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RegisterExpenseFragment : Fragment() {

    private lateinit var binding: FragmentRegisterExpenseBinding
    private val expenseViewModel : ExpenseViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_register_expense, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentRegisterExpenseBinding.bind(view)

        val ex = Expense(title = "some other",amount = 10.0)
        expenseViewModel.insertExpense(ex)
    }
}