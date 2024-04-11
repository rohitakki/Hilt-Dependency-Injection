package com.recipe.hiltdependencyinjection.manager

import javax.inject.Inject

class SampleManager @Inject constructor() {

    fun sampleFun() {
        println("Sample function called.")
    }
}