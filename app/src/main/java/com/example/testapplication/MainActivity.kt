package com.example.testapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(), ListFragmentInterractor {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startListFragment()
    }

    private fun startListFragment() {
        supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, ListFragment.newInstance())
                .addToBackStack(null)
                .commit()
    }

    override fun onItemClick(color: Int, text: String) {
        supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, DetailsFragment.newInstance(color, text))
                .addToBackStack(null)
                .commit()
    }
}