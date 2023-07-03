package com.example.summerpractice

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.summerpractice.databinding.FragmentSettingBinding
import com.google.android.material.snackbar.Snackbar

class SettingFragment : Fragment(R.layout.fragment_setting) {
    private  var binding: FragmentSettingBinding? = null
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val bundle = Bundle()
        bundle.putString(resources.getString(R.string.previous_fragment_class), this.javaClass.simpleName)
        binding = FragmentSettingBinding.bind(view)
        binding?.run {
            btnPaymentServices.setOnClickListener {
                findNavController().navigate(R.id.action_settingFragment_to_developmentFragment, bundle)
            }
            btnPrivacy.setOnClickListener {
                findNavController().navigate(R.id.action_settingFragment_to_developmentFragment, bundle)
            }
            btnSafety.setOnClickListener {
                findNavController().navigate(R.id.action_settingFragment_to_developmentFragment, bundle)
            }
        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}