package com.recipe.hiltdependencyinjection.module

import android.content.Context
import com.recipe.hiltdependencyinjection.interfaces.SampleInterface
import com.recipe.hiltdependencyinjection.manager.InterfaceManager
import com.recipe.hiltdependencyinjection.manager.InterfaceManager2
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Qualifier

@Module
@InstallIn(SingletonComponent::class)
class SampleModule {

    @Provides
    @IM1
    fun provideInterfaceManager(@ApplicationContext context: Context): SampleInterface {
        return InterfaceManager(context)
    }

    @Provides
    @IM2
    fun provideInterfaceManager2(@ApplicationContext context: Context): SampleInterface {
        return InterfaceManager2(context)
    }
}

@Qualifier
@Target(AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY, AnnotationTarget.VALUE_PARAMETER)
annotation class IM1
annotation class IM2
