package com.example.app.data.dao.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "perfume")
data class Plant (
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,
    var name: String,
    var biologicalName: String,
    var type: FragranceType,
    var scentStrength: ScentStrength,
    var meaning: String,
    var favourite: Boolean = false
)