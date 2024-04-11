package com.recipe.hiltdependencyinjection.di.module

import android.content.Context
import androidx.room.Room
import com.recipe.hiltdependencyinjection.database.WordsDao
import com.recipe.hiltdependencyinjection.database.WordsDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RoomModule {

    @Provides
    fun provideWordsDatabase(@ApplicationContext context: Context): WordsDatabase {
        return Room.databaseBuilder(context, WordsDatabase::class.java, "words.db").build()
    }

    @Provides
    fun provideWordsDao(wordsDatabase: WordsDatabase): WordsDao {
        return wordsDatabase.wordsDao()
    }
}