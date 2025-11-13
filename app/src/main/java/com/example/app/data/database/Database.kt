package com.example.app.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.app.data.dao.converters.BloomTimeConverter
import com.example.app.data.dao.converters.PlantTypeConverter
import com.example.app.data.dao.PerfumeDao
import com.example.app.data.dao.models.Perfume

@Database(
    entities = [Perfume::class],
    version = 4
)
@TypeConverters(PlantTypeConverter::class, BloomTimeConverter::class)
abstract class PlantDatabase: RoomDatabase() {
    abstract val perfumeDao: PerfumeDao
}