package com.example.crudroom

import androidx.room.*

@Dao
interface DaoPersona {
    @Query("SELECT * FROM Persona")
    fun getAll():List<Persona>

    @Query("SELECT * FROM Persona WHERE id = :id")
    fun getById(id:Int):Persona

    @Update
    fun update(persona: Persona)

    @Insert
    fun insert(people: List<Persona>)

    @Delete
    fun delete(persona: Persona)
}