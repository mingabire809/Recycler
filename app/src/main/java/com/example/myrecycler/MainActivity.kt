package com.example.myrecycler

import android.graphics.drawable.ClipDrawable.HORIZONTAL
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import com.example.myrecycler.databinding.ActivityMainBinding
import com.example.myrecycler.models.MovieModel


class MainActivity : AppCompatActivity() {
    private lateinit var layout: ActivityMainBinding
    private lateinit var movieList: ArrayList<MovieModel>
    private lateinit var moviesAdapter: MoviesAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        layout = ActivityMainBinding.inflate(layoutInflater)
        val view = layout.root
        setContentView(view)
        val recyclerview = layout.mylist
        val itemDecor = DividerItemDecoration(applicationContext, HORIZONTAL)
        recyclerview.addItemDecoration(itemDecor)
        movieList = ArrayList()
        var x=1
        while (x<45){
            loadMovies()
            x++
        }
        moviesAdapter = MoviesAdapter(movieList)
        recyclerview.adapter = moviesAdapter


    }

    private fun loadMovies() {
        movieList.add(MovieModel("War Room","A christian movie that signifies the role of prayer in a family..", R.drawable.images))

    }
}