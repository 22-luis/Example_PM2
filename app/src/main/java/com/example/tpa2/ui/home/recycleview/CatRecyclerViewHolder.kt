package com.example.tpa2.ui.home.recycleview

import androidx.recyclerview.widget.RecyclerView
import com.example.tpa2.data.model.CatModel
import com.example.tpa2.databinding.ItemCatBinding

class CatRecyclerViewHolder(private val binding: ItemCatBinding):RecyclerView.ViewHolder(binding.root) {
    fun bind (cat: CatModel, clickListener:(CatModel) -> Unit) {

        binding.nameTextView.text = cat.name
        binding.razeTextView.text = cat.Raze

        binding.catItemCardView.setOnClickListener{
            clickListener(cat)
        }
    }
}