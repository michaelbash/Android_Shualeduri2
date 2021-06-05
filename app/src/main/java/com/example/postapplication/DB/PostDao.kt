package com.example.postapplication.DB

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.postapplication.model.Post


@Dao
interface PostDao {

    @Query( "SELECT * FROM POSTS")
    fun getAllPosts(): LiveData<List<Post>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAllPosts(postList: List<Post>)

    @Query("DELETE FROM POSTS")
    fun deleteAllPosts()

}