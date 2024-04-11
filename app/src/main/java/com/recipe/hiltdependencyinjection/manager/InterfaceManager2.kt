package com.recipe.hiltdependencyinjection.manager

import android.content.Context
import com.recipe.hiltdependencyinjection.interfaces.SampleInterface

class InterfaceManager2(private val context: Context): SampleInterface {
    override fun callInterfaceFunction() {
        println("InterfaceManager 2 called")
    }
}