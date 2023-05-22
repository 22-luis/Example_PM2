package com.example.tpa2.repositories

import com.example.tpa2.data.model.CatModel

class CatRepository(private val cats: MutableList<CatModel>) {

    fun getCats () = cats

    fun setCats(cat: CatModel) = cats.add(cat)

}