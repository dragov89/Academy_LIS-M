package com.example.academy_lis_m.main.presentation.tab.task

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.academy_lis_m.R
import com.example.academy_lis_m.databinding.FragmentRaportBinding

class RaportFragment : Fragment() {
    private lateinit var binding: FragmentRaportBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRaportBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.saveRaport.setOnClickListener {
            findNavController().navigate(R.id.action_raportFragment_to_taskFragment)
        }
    }

}