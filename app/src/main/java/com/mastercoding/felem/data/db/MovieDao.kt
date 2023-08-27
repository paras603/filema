package com.mastercoding.felem.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.mastercoding.felem.data.model.Movie

@Dao
interface MovieDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveMovies(movies: List<Movie>)

    @Query("DELETE FROM popular_movies")
    suspend fun deleteALlMovies()

    @Query("SELECT * FROM popular_movies")
    suspend fun getMovies(): List<Movie>

}