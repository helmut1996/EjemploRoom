package com.example.crudroom

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [Persona::class],
    version = 1
)

abstract class PeopleDd: RoomDatabase() {

    abstract fun DaoPersona():DaoPersona
}