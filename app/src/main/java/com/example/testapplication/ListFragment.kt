package com.example.testapplication

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_list.*
import java.lang.IllegalStateException

class ListFragment : Fragment(R.layout.fragment_list) {

    private lateinit var fragmentInterractor: ListFragmentInterractor

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is ListFragmentInterractor) {
            fragmentInterractor = context
        } else {
            throw IllegalStateException("Activity must implement ListFragmentInterractor")
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initRecycler()
    }

    private fun initRecycler() {
//        val colorsAdapter =
//            ColorsAdapter(requireContext()) { color, text -> onItemClick(color, text) }
        val colorsAdapter = ColorsAdapter(requireContext(), ::onItemClick)
        colorsAdapter.update(DataSource.getData())

        with(recyclerView) {
            adapter = colorsAdapter
            layoutManager = LinearLayoutManager(requireContext())
        }
    }

    private fun onItemClick(color: Int, text: String) {
        fragmentInterractor.onItemClick(color, text)
    }

    companion object {

        fun newInstance(): Fragment = ListFragment()
    }
}