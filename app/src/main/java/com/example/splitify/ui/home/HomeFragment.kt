package com.example.splitify.ui.home

import android.os.Bundle
import android.text.SpannableString
import android.text.SpannableStringBuilder
import android.text.Spanned
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.splitify.R
import com.example.splitify.databinding.FragmentHomeBinding
import com.example.splitify.ui.history.HistoryFragment

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.apply {
            expenseRv.apply {
                layoutManager = LinearLayoutManager(requireContext())
                setHasFixedSize(true)
                adapter = SpentByAdapter()
            }

            showExpensesCv.setOnClickListener {
                // navigate to history fragment
                parentFragmentManager.beginTransaction()
                    .replace(R.id.fragment_container, HistoryFragment())
                    .addToBackStack(null)
                    .commit()
            }
        }
    }
}