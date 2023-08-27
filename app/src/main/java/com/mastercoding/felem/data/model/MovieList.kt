package com.mastercoding.felem.data.model

import com.google.gson.annotations.SerializedName
import com.mastercoding.felem.data.model.Movie

data class MovieList(
    @SerializedName("results")
    val movies: List<Movie>
)
