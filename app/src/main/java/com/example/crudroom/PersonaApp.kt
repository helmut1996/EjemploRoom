package com.example.crudroom

import android.app.Application
import androidx.room.Room

class PersonaApp: Application() {

    val room= Room
        .databaseBuilder(this,PeopleDd::class.java,"person")
        .build()
}