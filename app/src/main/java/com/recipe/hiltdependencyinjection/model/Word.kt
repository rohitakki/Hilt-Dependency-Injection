package com.recipe.hiltdependencyinjection.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "words_table")
data class Word(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val word: String
)