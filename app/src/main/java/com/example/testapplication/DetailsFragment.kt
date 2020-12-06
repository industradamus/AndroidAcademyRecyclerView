package com.example.testapplication

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment

class DetailsFragment : Fragment(R.layout.fragment_details) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(view.findViewById<TextView>(R.id.colorTextView)) {
            setTextColor(requireArguments().getInt(ARG_COLOR))
            text = requireArguments().getString(ARG_TEXT)
        }
    }

    companion object {

        private const val ARG_COLOR = "color"
        private const val ARG_TEXT = "text"

        fun newInstance(color: Int, text: String): Fragment =
            DetailsFragment().apply {
                arguments = bundleOf(
                    ARG_COLOR to color,
                    ARG_TEXT to text
                )
            }
    }
}