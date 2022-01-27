package com.example.academy_lis_m.splash

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.academy_lis_m.databinding.FragmentSplashBinding
import com.example.academy_lis_m.main.presentation.MainActivity
import com.example.academy_lis_m.main.presentation.MainActivityArgs

//
class SplashFragment : Fragment() {
    private lateinit var binding: FragmentSplashBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSplashBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnAdmin.setOnClickListener {
            transfer(true)
        }
        binding.btnTab.setOnClickListener {
            transfer(false)
        }
    }

    private fun transfer(isSinglIn: Boolean) {
        val intent = Intent(requireContext(), MainActivity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
        val arg = MainActivityArgs(isSinglIn)
        intent.putExtras(arg.toBundle())
        startActivity(intent)
    }

}