package com.example.summerpractice

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.example.summerpractice.databinding.FragmentFilmsBinding

class FilmsFragment : Fragment(R.layout.fragment_films) {

    private var _binding: FragmentFilmsBinding? = null
    private val binding get() = _binding!!
    private var adapter: FilmAdapter? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val bundle = Bundle()
        _binding = FragmentFilmsBinding.bind(view)
        adapter = FilmAdapter(
            FilmRepository.list,
            Glide.with(this)
        ){ film ->
            bundle.putInt("ID", film.id)
            findNavController().navigate(R.id.action_filmsFragment_to_infoFragment, bundle)
        }
        binding.rvFilm.adapter = adapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}