package com.example.academy_lis_m.main.presentation.tab.task

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.academy_lis_m.R
import com.example.academy_lis_m.databinding.FragmentNewTaskBinding

class NewTaskFragment : Fragment() {
    lateinit var binding: FragmentNewTaskBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNewTaskBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            exitNoveZavdanya.setOnClickListener {
                findNavController().navigate(R.id.action_newTaskFragment_to_taskFragment)
            }
        }
    }


}