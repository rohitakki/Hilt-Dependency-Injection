package com.recipe.hiltdependencyinjection.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.recipe.hiltdependencyinjection.model.Word

@Database(entities = [Word::class], exportSchema = false, version = 1)
abstract class WordsDatabase : RoomDatabase() {

    abstract fun wordsDao(): WordsDao
}