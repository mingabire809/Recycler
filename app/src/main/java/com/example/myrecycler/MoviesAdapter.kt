package com.example.myrecycler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myrecycler.models.MovieModel

internal class MoviesAdapter(private val movieList: List<MovieModel>) :
    RecyclerView.Adapter<MoviesAdapter.MyViewHolder>() {
    internal class MyViewHolder(itemRow: View) : RecyclerView.ViewHolder(itemRow) {
        val title: TextView = itemRow.findViewById(R.id.title)
        val des: TextView = itemRow.findViewById(R.id.des)
        val image: ImageView=itemRow.findViewById(R.id.image)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemRow =
            LayoutInflater.from(parent.context).inflate(R.layout.row_layout, parent, false)
        return MyViewHolder(itemRow)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentMovie = movieList[position]
        holder.title.text=currentMovie.title
        holder.des.text=currentMovie.des
        holder.image.setImageResource(currentMovie.image)

    }

    override fun getItemCount(): Int {
     return movieList.size
    }
}