package com.example.academy_lis_m.main.presentation.admin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.academy_lis_m.R
import com.example.academy_lis_m.databinding.FragmentAdminHomeBinding
import com.example.academy_lis_m.main.data.UserRepositiryImpl
import com.example.academy_lis_m.main.domain.repository.RegisterRepository

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
            findNavController().navigate(R.id.action_adminHomeFragment_to_tabFragment)
        }

        binding.btnAdmin.setOnClickListener {
        }

    }


}