package com.example.lab_week_10

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface TotalDao {
    @Insert
    suspend fun insert(total: Total)

    @Update
    suspend fun update(total: Total)

    @Query("SELECT * FROM total LIMIT 1")
    suspend fun getTotal(): Total?
}
