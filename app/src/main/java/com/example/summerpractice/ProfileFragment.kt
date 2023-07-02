package com.example.summerpractice

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.summerpractice.databinding.FragmentProfileBinding
import com.google.android.material.snackbar.Snackbar

class ProfileFragment : Fragment(R.layout.fragment_profile) {
    private var binding: FragmentProfileBinding? = null
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val bundle = Bundle()
        bundle.putString(resources.getString(R.string.previous_fragment_class), this.javaClass.simpleName)
        binding = FragmentProfileBinding.bind(view)
        binding?.run {
            btnSignIn.setOnClickListener {
                findNavController().navigate(R.id.action_profileFragment_to_developmentFragment, bundle)
            }
            btnSignUp.setOnClickListener {
                findNavController().navigate(R.id.action_profileFragment_to_developmentFragment, bundle)
            }
        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}