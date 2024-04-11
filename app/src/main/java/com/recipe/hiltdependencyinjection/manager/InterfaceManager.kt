package com.recipe.hiltdependencyinjection.manager

import com.recipe.hiltdependencyinjection.interfaces.SampleInterface

class InterfaceManager : SampleInterface {
    override fun callInterfaceFunction() {
        println("Interface function called.")
    }
}