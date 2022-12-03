package com.example.viewpagertest.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.viewpagertest.MainActivity
import com.example.viewpagertest.fragments.BruhFragment
import com.example.viewpagertest.fragments.HomeFragment
import com.example.viewpagertest.fragments.IdkFragment

class ViewPagerFragmentAdapter(frm: FragmentActivity): FragmentStateAdapter(frm) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        if(position == 0){
            return HomeFragment()
        }
        if( position == 1){
            return IdkFragment()
        }
        if(position == 2){
            return BruhFragment()
        }
        return(Fragment())
    }


}