package com.example.tpa2.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tpa2.R
import com.example.tpa2.data.model.CatModel
import com.example.tpa2.databinding.FragmentHomeBinding
import com.example.tpa2.ui.home.recycleview.CatRecyclerViewAdapter
import com.example.tpa2.viewmodel.CatViewModel
import com.google.android.material.floatingactionbutton.FloatingActionButton

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    private lateinit var adapter: CatRecyclerViewAdapter

    private val catViewModel: CatViewModel by activityViewModels {
        CatViewModel.Factory
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    private fun showSelectedItem(cat: CatModel) {
        catViewModel.setSelectCat(cat)
        findNavController().navigate(R.id.action_homeFragment_to_catFragment)
    }

    private fun displayCats() {
        adapter.setData(catViewModel.getCats())
        adapter.notifyDataSetChanged()
    }

    private fun setRecyclerView(view : View) {
        binding.catsRecyclerView.layoutManager = LinearLayoutManager(view.context)

        adapter = CatRecyclerViewAdapter { selectedCat ->
            showSelectedItem(selectedCat)
        }

        binding.catsRecyclerView.adapter = adapter

        displayCats()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setRecyclerView(view)

        binding.btnAdd.setOnClickListener{
            it.findNavController().navigate(R.id.action_homeFragment_to_addCatFragment)
        }


    }

}