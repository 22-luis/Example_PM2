package com.example.tpa2.ui.addcat

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.tpa2.databinding.FragmentAddCatBinding
import com.example.tpa2.viewmodel.CatViewModel

class AddCatFragment : Fragment() {

    private lateinit var binding: FragmentAddCatBinding

    private val catViewModel: CatViewModel by activityViewModels {
        CatViewModel.Factory
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAddCatBinding.inflate(inflater, container, false)
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