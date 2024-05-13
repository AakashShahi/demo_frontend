package com.example.myproject

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.myproject.databinding.ActivityMain2Binding
import com.example.myproject.fragment.ExploreFragment
import com.example.myproject.fragment.HomeFragment
import com.example.myproject.fragment.SearchFragment
import com.example.myproject.fragment.VideoFragment

class MainActivity2 : AppCompatActivity() {
    lateinit var dashBiniding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        dashBiniding=ActivityMain2Binding.inflate(layoutInflater)
        setContentView(dashBiniding.root)

        replaceFragment(HomeFragment())
        dashBiniding.navBar.setOnItemSelectedListener {
            when(it.itemId){
                R.id.home-> replaceFragment(HomeFragment())
                R.id.search-> replaceFragment(SearchFragment())
                R.id.reels-> replaceFragment(VideoFragment())
                R.id.explore-> replaceFragment(ExploreFragment())
                else->{}

            }
         true
        }

        }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager: FragmentManager=supportFragmentManager
        val fragmentTransaction: FragmentTransaction=fragmentManager.beginTransaction()

        fragmentTransaction.replace(R.id.myFrame,fragment)
        fragmentTransaction.commit()
    }
}
