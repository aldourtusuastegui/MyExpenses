package com.acsoft.myexpenses.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.acsoft.myexpenses.R
import com.acsoft.myexpenses.data.model.Expense
import com.acsoft.myexpenses.databinding.FragmentRegisterExpenseBinding
import com.acsoft.myexpenses.presentation.ExpenseViewModel
import com.acsoft.myexpenses.utils.Validation
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

        inputListener()
    }

    private fun inputListener() {
        binding.registerExpenseButton.isEnabled = false

        binding.title.addTextChangedListener {
            binding.registerExpenseButton.isEnabled = validateForm()
        }

        binding.amount.addTextChangedListener {
            binding.registerExpenseButton.isEnabled = validateForm()
        }

        binding.registerExpenseButton.setOnClickListener {
            registerExpense()
            backToPreviousFragment()
        }
    }

    private fun validateForm() : Boolean {
        val title = binding.title.text.toString()
        val amount = binding.amount.text.toString()
        return (Validation.validateTitleInput(title) && Validation.validateAmountInput(amount))
    }

    private fun registerExpense() {
        val title = binding.title.text.toString()
        val amount = binding.amount.text.toString()
        expenseViewModel.insertExpense(Expense(title = title,amount = amount.toDouble()))
    }

    private fun backToPreviousFragment() {
        findNavController().popBackStack()
    }

}