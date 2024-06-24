package com.devspace.taskbeats

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

//maneira como vai ACESSAR a base de dados
@Dao
interface CategoryDao {
    @Query("Select * From categoryentity")
    fun getAll(): List<CategoryEntity>

    @Insert
    fun insetAll(vararg categoryEntity: CategoryEntity)
}