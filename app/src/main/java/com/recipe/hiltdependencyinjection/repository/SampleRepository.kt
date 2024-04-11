package com.recipe.hiltdependencyinjection.repository

import android.util.Log
import com.recipe.hiltdependencyinjection.manager.SampleManager
import javax.inject.Inject

class SampleRepository @Inject constructor(private val sampleManager: SampleManager) {
    fun callApi() {
        Log.d(SampleManager::class.java.simpleName, "callApi() function called")
    }

    fun callApiByOtherClass() {
        sampleManager.sampleFun()
    }
}