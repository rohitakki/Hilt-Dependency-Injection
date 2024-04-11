package com.recipe.hiltdependencyinjection.repository

import android.util.Log
import com.recipe.hiltdependencyinjection.interfaces.SampleInterface
import com.recipe.hiltdependencyinjection.manager.SampleManager
import com.recipe.hiltdependencyinjection.module.IM2
import javax.inject.Inject
import javax.inject.Named

class SampleRepository @Inject constructor(private val sampleManager: SampleManager,@IM2 private val sampleInterface: SampleInterface) {
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