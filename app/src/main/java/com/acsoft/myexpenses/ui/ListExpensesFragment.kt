package com.acsoft.myexpenses.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.acsoft.myexpenses.R
import com.acsoft.myexpenses.databinding.FragmentListExpensesBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ListExpensesFragment : Fragment() {

    private lateinit var binding: FragmentListExpensesBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_list_expenses, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentListExpensesBinding.bind(view)

        binding.fab.setOnClickListener {
            findNavController().navigate(R.id.action_listExpensesFragment_to_registerExpenseFragment)
        }
    }
}