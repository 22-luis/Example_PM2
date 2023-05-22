package com.example.tpa2.ui.cat

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.tpa2.R
import com.example.tpa2.databinding.FragmentCatBinding
import com.example.tpa2.ui.home.recycleview.CatRecyclerViewAdapter
import com.example.tpa2.viewmodel.CatViewModel

class CatFragment : Fragment() {

    private lateinit var binding: FragmentCatBinding

    private val catViewModel: CatViewModel by activityViewModels {
        CatViewModel.Factory
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCatBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setViewModel()

    }

    private fun setViewModel() {
        binding.viewmodel = catViewModel
    }

}