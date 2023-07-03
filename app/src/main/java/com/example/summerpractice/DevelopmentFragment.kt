package com.example.summerpractice

import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.FrameLayout
import androidx.fragment.app.Fragment
import com.google.android.material.snackbar.Snackbar

class DevelopmentFragment: Fragment(R.layout.fragment_development) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val previousFragmentClass = arguments?.getString(resources.getString(R.string.previous_fragment_class))
        showSnackBar(view, "$previousFragmentClass")

    }

    fun showSnackBar(view: View, message: String, gravity: Int = Gravity.TOP, duration: Int = Snackbar.LENGTH_SHORT) {
        val snackbar = Snackbar.make(view, message, duration)
        val params = snackbar.view.layoutParams as FrameLayout.LayoutParams
        params.gravity = gravity
        snackbar.view.layoutParams = params
        snackbar.show()
    }}