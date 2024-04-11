package com.recipe.hiltdependencyinjection.repository

import android.util.Log
import com.recipe.hiltdependencyinjection.interfaces.SampleInterface
import com.recipe.hiltdependencyinjection.manager.SampleManager
import javax.inject.Inject

class SampleRepository @Inject constructor(private val sampleManager: SampleManager, private val sampleInterface: SampleInterface) {
    fun callApi() {
        Log.d(SampleManager::class.java.simpleName, "callApi() function called")
    }

    fun callApiByOtherClass() {
        sampleManager.sampleFun()
    }

    fun callInterfaceFunction() {
        sampleInterface.callInterfaceFunction()
    }
}