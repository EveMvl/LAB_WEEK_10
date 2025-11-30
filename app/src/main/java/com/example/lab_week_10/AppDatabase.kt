package com.example.lab_week_10

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Total::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun totalDao(): TotalDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "lab_week_10_db"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}
