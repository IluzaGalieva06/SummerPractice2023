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
    private var InfId: String? = null
    private var InfDir: String? = null
    private var InfName: String? = null


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
            InfName = resources.getString(R.string.name) + ": " + film?.name
            InfId = resources.getString(R.string.id) + ": " + film?.id
            tvName?.text = InfName
            InfDir = resources.getString(R.string.Director) + ": " + film?.director
            tvElem?.text = InfDir
            tvId?.text = InfId

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