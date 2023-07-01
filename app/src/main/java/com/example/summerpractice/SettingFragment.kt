package com.example.summerpractice

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.summerpractice.databinding.FragmentSettingBinding

class SettingFragment : Fragment(R.layout.fragment_setting) {
    private  var binding: FragmentSettingBinding? = null
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSettingBinding.bind(view)
        binding?.run {
            btnPaymentServices.setOnClickListener {
                findNavController().navigate(R.id.action_settingFragment_to_developmentFragment)
            }
            btnPrivacy.setOnClickListener {
                findNavController().navigate(R.id.action_settingFragment_to_developmentFragment)
            }
            btnSafety.setOnClickListener {
                findNavController().navigate(R.id.action_settingFragment_to_developmentFragment)
            }
        }
    }
}