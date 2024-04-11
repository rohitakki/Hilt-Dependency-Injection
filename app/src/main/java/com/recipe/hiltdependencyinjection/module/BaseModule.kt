package com.recipe.hiltdependencyinjection.module

import com.recipe.hiltdependencyinjection.interfaces.SampleInterface
import com.recipe.hiltdependencyinjection.manager.InterfaceManager
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class BaseModule {

    @Provides
    fun provideSampleInterface(): SampleInterface {
        return InterfaceManager()
    }
}