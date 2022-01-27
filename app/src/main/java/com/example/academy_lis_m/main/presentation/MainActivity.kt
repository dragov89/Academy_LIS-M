package com.example.academy_lis_m.main.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.academy_lis_m.R
import com.example.academy_lis_m.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val navController = getRootNavController()
        prepareRootNavController(isSingledInt(), navController)

    }
    private fun getRootNavController(): NavController {
        val navHost = supportFragmentManager.findFragmentById(R.id.mainContainer) as NavHostFragment
        return navHost.navController
    }
    private fun prepareRootNavController(isSignedIn: Boolean, navController: NavController) {
        val graph = navController.navInflater.inflate(getMainGraph())
        graph.setStartDestination(
            if (isSignedIn) {
                getAdminDestination()
            } else {
                getTabDestination()
            }
        )
        navController.graph = graph
    }
    private fun isSingledInt(): Boolean{
        val bundle = intent.extras?: throw IllegalStateException("splash null")
        val args = MainActivityArgs.fromBundle(bundle)
        return args.argsMain
    }
    private fun getMainGraph():Int = R.navigation.main_nav_graph
    private fun getTabDestination():Int = R.id.tabFragment
    private fun getAdminDestination():Int = R.id.adminHomeFragment
}