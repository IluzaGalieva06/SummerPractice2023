package com.example.summerpractice

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.example.summerpractice.databinding.FragmentInfoBinding

class InfoFragment : Fragment(R.layout.fragment_info) {

    private var _binding: FragmentInfoBinding? = null
    private val binding get() = _binding!!
    private var tvName: TextView? = null
    private var tvElem: TextView? = null
    private var tvId: TextView? = null
    private var film: Film? = null
    private var idFromBundle: Int? = null
    private var ivCover: ImageView? = null


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentInfoBinding.bind(view)
        tvName = binding.tvName
        tvElem = binding.tvElem
        ivCover = binding.ivCover
        tvId = binding.tvId

        idFromBundle = arguments?.getInt("ID")
        film = FilmRepository.getFilmById(idFromBundle!!)
        if (film != null) {
            tvName?.text = film?.name
            tvElem?.text = film?.director
            tvId?.text = film?.id?.toString()

            Glide.with(binding.root)
                .load(film?.url)
                .placeholder(R.drawable.baseline_local_florist_24)
                .error(R.drawable.not_found)
                .into(ivCover!!)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}