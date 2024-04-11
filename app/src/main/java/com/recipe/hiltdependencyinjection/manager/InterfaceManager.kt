package com.recipe.hiltdependencyinjection.manager

import android.content.Context
import com.recipe.hiltdependencyinjection.R
import com.recipe.hiltdependencyinjection.interfaces.SampleInterface

class InterfaceManager(private val context: Context) : SampleInterface {
    override fun callInterfaceFunction() {
        println("Interface function called.")
        println("App Name: " + context.getString(R.string.app_name))
    }
}