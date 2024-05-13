package com.example.myproject.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.myproject.fragment.ExploreFragment
import com.example.myproject.fragment.HomeFragment
import com.example.myproject.fragment.SearchFragment

class TabAdapter(var fragmentManager: FragmentManager, var lifecycle
: Lifecycle):FragmentStateAdapter(fragmentManager, lifecycle)
{
    override fun getItemCount(): Int {
        return  3
    }

    override fun createFragment(position: Int): Fragment {
        when(position){
            0-> return HomeFragment()
            1-> return SearchFragment()
            2-> return ExploreFragment()

        }

    }

}