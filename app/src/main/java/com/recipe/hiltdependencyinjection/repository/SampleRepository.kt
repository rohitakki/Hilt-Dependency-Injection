package com.recipe.hiltdependencyinjection.repository

import android.util.Log
import javax.inject.Inject

class SampleRepository @Inject constructor() {

    fun callApi() {
        Log.d(SampleRepository::class.java.simpleName, "API CALLED")
    }
}