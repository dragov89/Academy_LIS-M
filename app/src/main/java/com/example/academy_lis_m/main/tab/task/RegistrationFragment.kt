package com.example.academy_lis_m.main.tab.task

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.academy_lis_m.R
import com.example.academy_lis_m.databinding.FragmentRegistrationBinding

class RegistrationFragment : Fragment() {
private lateinit var binding: FragmentRegistrationBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRegistrationBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnRegistrPanelIfo.setOnClickListener {
           //parentFragmentManager.beginTransaction().replace(R.id.oneContainer, TaskFragment()).commit()
            findNavController().navigate(R.id.action_registrationFragment_to_taskFragment)
        }
    }

}