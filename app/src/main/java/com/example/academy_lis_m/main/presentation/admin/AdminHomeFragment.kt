package com.example.academy_lis_m.main.presentation.admin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.academy_lis_m.R
import com.example.academy_lis_m.databinding.FragmentAdminHomeBinding

class AdminHomeFragment : Fragment() {
    private lateinit var binding: FragmentAdminHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAdminHomeBinding.inflate(inflater)
    return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnTab.setOnClickListener {

        }

        binding.btnAdmin.setOnClickListener {
            findNavController().navigate(R.id.action_adminHomeFragment_to_adminListItemFragment)

        }

    }


}