package com.example.postapplication.DB

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.postapplication.model.Post


@Database(entities = [(Post::class)], version = 1)
abstract class PostDatabase : RoomDatabase() {

    abstract fun postDao() : PostDao
}