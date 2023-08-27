package com.mastercoding.felem.presentation

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.mastercoding.felem.R
import com.mastercoding.felem.data.model.Movie
import com.mastercoding.felem.databinding.ListItemBinding

class MovieAdapter() : RecyclerView.Adapter<MovieAdapter.MyViewHolder>() {
    private val movieList = ArrayList<Movie>()

    fun setList(movies: List<Movie>){
        movieList.clear()
        movieList.addAll(movies)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding: ListItemBinding = DataBindingUtil.inflate(
            layoutInflater,
            R.layout.list_item,
            parent,
            false
        )
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(movieList[position])
    }

    override fun getItemCount(): Int {
        return movieList.size
    }

    class MyViewHolder(val binding: ListItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

            fun bind(movie: Movie){
                binding.titleTextView.text = movie.title
                binding.descTextView.text = movie.overview

//                val posterURL = "https://api.themoviedb.org/3/movie/{movie_id}/images"
                val posterURL = "https://image.imdb.org/t/p/w500/" + movie.posterPath

                Glide.with(binding.imageView.context)
                    .load(posterURL)
                    .into(binding.imageView)

            }

    }


}