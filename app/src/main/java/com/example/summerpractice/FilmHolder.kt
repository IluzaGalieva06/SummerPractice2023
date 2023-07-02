package com.example.summerpractice

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestManager
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import com.example.summerpractice.databinding.ItemFilmBinding

class FilmHolder (

    private val binding: ItemFilmBinding,
    private val glide: RequestManager,
    private val onItemClick: (Film) -> Unit

) : RecyclerView.ViewHolder(binding.root) {

    private val options: RequestOptions = RequestOptions()
        .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)

    fun onBind(film: Film) {
        with(binding) {
            tvTitle.text = film.name
            tvDesc.text = film.director
            root.setOnClickListener {
                onItemClick(film)
            }
            Glide.with(binding.root)
                .load(film.url)
                .placeholder(R.drawable.baseline_local_florist_24)
                .error(R.drawable.not_found)
                .into(ivCover)
        }
    }
}