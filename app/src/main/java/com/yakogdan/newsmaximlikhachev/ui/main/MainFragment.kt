package com.yakogdan.newsmaximlikhachev.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.yakogdan.newsmaximlikhachev.R
import com.yakogdan.newsmaximlikhachev.databinding.FragmentFavoriteBinding
import com.yakogdan.newsmaximlikhachev.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private var _binding: FragmentMainBinding? = null
    private val mBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMainBinding.inflate(layoutInflater, container, false)
        return mBinding.root
    }
}