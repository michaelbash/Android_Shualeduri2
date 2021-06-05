package com.example.postapplication.model

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "POSTS")
data class Post (

    @PrimaryKey
    val userId: Int,
    val id: Int,
    val title: String,
    val body: String
)