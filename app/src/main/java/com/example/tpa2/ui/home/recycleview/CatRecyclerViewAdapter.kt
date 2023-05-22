package com.example.tpa2.ui.home.recycleview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tpa2.data.model.CatModel
import com.example.tpa2.databinding.ItemCatBinding


class CatRecyclerViewAdapter(
    private val clickListener: (CatModel) -> Unit
): RecyclerView.Adapter<CatRecyclerViewHolder>() {

    private val cats = ArrayList<CatModel>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CatRecyclerViewHolder {
        val binding = ItemCatBinding.inflate(LayoutInflater.from(parent.context), parent,false)
        return CatRecyclerViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return cats.size
    }

    override fun onBindViewHolder(holder: CatRecyclerViewHolder, position: Int) {
        val cat = cats[position]
        holder.bind(cat,clickListener)
    }

    fun setData(catsList: List<CatModel>) {
        cats.clear()
        cats.addAll(catsList)
    }
}