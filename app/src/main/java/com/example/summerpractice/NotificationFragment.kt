package com.example.summerpractice

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.summerpractice.databinding.FragmentNotificationBinding

class NotificationFragment : Fragment(R.layout.fragment_notification) {
    private var binding: FragmentNotificationBinding? = null
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentNotificationBinding.bind(view)
        binding?.run {
            btnWrite.setOnClickListener {
                findNavController().navigate(R.id.action_notificationFragment_to_developmentFragment)
            }
        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}