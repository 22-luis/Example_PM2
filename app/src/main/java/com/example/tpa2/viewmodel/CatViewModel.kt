package com.example.tpa2.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.tpa2.CatReviewerApplication
import com.example.tpa2.data.model.CatModel
import com.example.tpa2.repositories.CatRepository

class CatViewModel(private val repository: CatRepository): ViewModel() {
    val name = MutableLiveData("")
    val age = MutableLiveData("")
    val raze = MutableLiveData("")

    fun getCats () = repository.getCats()

    private fun addCat(cat: CatModel) = repository.setCats(cat)

    fun createCat() {
        val cat = CatModel(
            name.value!!,
            raze.value!!,
            age.value!!,
        )

        addCat(cat)
    }

    companion object {
        val Factory = viewModelFactory {
            initializer {
                val catRepositoryApp = (this[APPLICATION_KEY] as CatReviewerApplication).catRepository

                CatViewModel(catRepositoryApp)
            }
        }
    }

    fun setSelectCat(cat: CatModel) {
        name.value = cat.name
        age.value = cat.age
        raze.value = cat.Raze
    }
}