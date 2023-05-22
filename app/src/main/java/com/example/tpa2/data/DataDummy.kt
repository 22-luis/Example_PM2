package com.example.tpa2.data

import com.example.tpa2.data.model.CatModel

const val name = "mariano"
const val raze = "muchking"
const val age = "1"


const val name2 = "celeste"
const val raze2 = "persian"
const val age2 = "1"


var cats = mutableListOf(
    CatModel(name, raze, age),
    CatModel(name2, raze2, age2)
)