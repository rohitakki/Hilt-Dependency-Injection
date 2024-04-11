package com.recipe.hiltdependencyinjection.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.recipe.hiltdependencyinjection.R
import com.recipe.hiltdependencyinjection.repository.SampleRepository
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var sampleRepository: SampleRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }

    private fun init() {
        sampleRepository.callApi()
        sampleRepository.callApiByOtherClass()
        sampleRepository.callInterfaceFunction()
    }
}