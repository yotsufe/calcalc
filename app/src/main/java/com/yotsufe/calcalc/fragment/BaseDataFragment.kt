package com.yotsufe.calcalc.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.yotsufe.calcalc.databinding.FragmentBaseDataBinding

/**
 * 基本データFragment
 */
class BaseDataFragment : Fragment() {

    private lateinit var binding: FragmentBaseDataBinding

    companion object {
        fun newInstance(): Fragment {
            return BaseDataFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBaseDataBinding.inflate(inflater, container, false)
        return binding.root
    }
}