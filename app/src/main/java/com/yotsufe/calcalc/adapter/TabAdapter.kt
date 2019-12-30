package com.yotsufe.calcalc.adapter

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.yotsufe.calcalc.R
import com.yotsufe.calcalc.fragment.BaseDataFragment

@Suppress("DEPRECATION")
class TabAdapter(fragmentManager: FragmentManager, private val context: Context)
    : FragmentStatePagerAdapter(fragmentManager){

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> BaseDataFragment.newInstance()
            else -> BaseDataFragment.newInstance()
        }
    }

    override fun getCount(): Int {
        return 3
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> context.getString(R.string.base_data)
            1 -> context.getString(R.string.goal_setting)
            else -> context.getString(R.string.pfc_balance)
        }
    }

}