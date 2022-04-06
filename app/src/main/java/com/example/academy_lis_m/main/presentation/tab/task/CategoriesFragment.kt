package com.example.academy_lis_m.main.presentation.tab.task

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.academy_lis_m.R
import com.example.academy_lis_m.databinding.FragmentCategoriesBinding

class CategoriesFragment : Fragment() {
   private lateinit var binding: FragmentCategoriesBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentCategoriesBinding.inflate(inflater)
     return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            one.setOnClickListener {
                findNavController().navigate(R.id.action_categoriesFragment_to_raportFragment)
            }
            two.setOnClickListener {
                findNavController().navigate(R.id.action_categoriesFragment_to_raportFragment)
            }
            three.setOnClickListener {
                findNavController().navigate(R.id.action_categoriesFragment_to_raportFragment)
            }
            four.setOnClickListener {
                findNavController().navigate(R.id.action_categoriesFragment_to_raportFragment)
            }
            five.setOnClickListener {
                findNavController().navigate(R.id.action_categoriesFragment_to_raportFragment)
            }
            six.setOnClickListener {
                findNavController().navigate(R.id.action_categoriesFragment_to_raportFragment)
            }

            exitKategoriya.setOnClickListener {
                findNavController().navigate(R.id.action_categoriesFragment_to_taskFragment)
            }
        }
    }


}