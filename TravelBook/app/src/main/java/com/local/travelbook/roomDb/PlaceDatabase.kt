package com.local.travelbook.roomDb

import androidx.room.Database
import androidx.room.RoomDatabase
import com.local.travelbook.model.Place

@Database(entities = [Place::class], version = 1)
abstract class PlaceDatabase : RoomDatabase() {
    abstract fun placeDao(): PlaceDao
}