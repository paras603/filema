package com.mastercoding.felem.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.mastercoding.felem.data.model.Movie

@Database(entities = [Movie::class], version = 1, exportSchema = false)
abstract class TMDBDatabase : RoomDatabase(){

    abstract fun movieDao() : MovieDao

}