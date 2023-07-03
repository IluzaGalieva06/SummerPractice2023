package com.example.summerpractice

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.summerpractice.databinding.FragmentNotificationBinding
import com.google.android.material.snackbar.Snackbar

class NotificationFragment : Fragment(R.layout.fragment_notification) {
    private var binding: FragmentNotificationBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val bundle = Bundle()
        bundle.putString(resources.getString(R.string.previous_fragment_class), this.javaClass.simpleName)

        binding = FragmentNotificationBinding.bind(view)
        binding?.run {
            btnWrite.setOnClickListener {
                findNavController().navigate(R.id.action_notificationFragment_to_developmentFragment, bundle)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}