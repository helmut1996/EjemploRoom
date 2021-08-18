package com.example.crudroom

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Persona(

  @PrimaryKey(autoGenerate = true)
    val id:Int,
    val name:String,
    val age:Int,
    val  address:String
)


