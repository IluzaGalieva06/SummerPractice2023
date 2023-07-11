package com.example.summerpractice

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.RequestManager
import com.example.summerpractice.databinding.ItemFilmBinding

class FilmAdapter(
    private var list: List<Film>,
    private val glide: RequestManager,
    private val onItemClick: (Film) -> Unit

) : RecyclerView.Adapter<FilmHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): FilmHolder = FilmHolder(
        binding = ItemFilmBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        ),
        glide = glide,
        onItemClick = onItemClick
    )

    override fun onBindViewHolder(
        holder: FilmHolder,
        position: Int
    ) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int = list.size

    fun updateData(newList: List<Film>) {
        list = newList
        notifyDataSetChanged()
    }
}