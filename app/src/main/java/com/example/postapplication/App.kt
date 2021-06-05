package com.example.postapplication

import android.app.Application
import com.example.postapplication.DB.PostDatabase

 class App : Application() {

    companion object {
        var database: PostDatabase? = null
    }

}