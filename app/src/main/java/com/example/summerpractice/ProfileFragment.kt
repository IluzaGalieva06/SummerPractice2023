package com.example.summerpractice

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.summerpractice.databinding.FragmentProfileBinding

class ProfileFragment : Fragment(R.layout.fragment_profile) {
    private var binding: FragmentProfileBinding? = null
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentProfileBinding.bind(view)
        binding?.run {
            btnSignIn.setOnClickListener {
                findNavController().navigate(R.id.action_profileFragment_to_developmentFragment)
            }
            btnSignUp.setOnClickListener {
                findNavController().navigate(R.id.action_profileFragment_to_developmentFragment)
            }
        }
    }
}