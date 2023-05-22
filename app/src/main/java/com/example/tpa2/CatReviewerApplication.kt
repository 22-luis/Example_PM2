package com.example.tpa2

import android.app.Application
import com.example.tpa2.data.cats
import com.example.tpa2.repositories.CatRepository

class CatReviewerApplication: Application() {

    val catRepository : CatRepository by lazy {
        CatRepository(cats)
    }
}