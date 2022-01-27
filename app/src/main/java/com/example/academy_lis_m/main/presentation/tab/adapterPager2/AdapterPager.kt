package com.example.academy_lis_m.main.presentation.tab.adapterPager2

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.academy_lis_m.main.presentation.tab.message.MessageFragment
import com.example.academy_lis_m.main.presentation.tab.search.SearchFragment
import com.example.academy_lis_m.main.presentation.tab.task.OneFragment

class AdapterPager(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> OneFragment()
            1 -> SearchFragment()
            else -> MessageFragment()
        }
    }
}