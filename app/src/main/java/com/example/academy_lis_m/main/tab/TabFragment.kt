package com.example.academy_lis_m.main.tab

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.academy_lis_m.R
import com.example.academy_lis_m.databinding.FragmentTabBinding
import com.example.academy_lis_m.main.tab.adapterPager2.AdapterPager
import com.google.android.material.tabs.TabLayoutMediator

class TabFragment : Fragment() {
    private lateinit var binding: FragmentTabBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTabBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }

    private fun init() {
        binding.viewPager.adapter = AdapterPager(requireActivity())
        //binding.tabLayout.tabIconTint = null
        binding.viewPager.isUserInputEnabled = false
        TabLayoutMediator(binding.tabLayout, binding.viewPager,false,false) { tab, pos ->
            when (pos) {
                0 -> tab.text = "Завдання"
                1 -> tab.text = "Обліки"
                2 -> tab.text = "Повідомлення"
            }
        }.attach()
    }

}