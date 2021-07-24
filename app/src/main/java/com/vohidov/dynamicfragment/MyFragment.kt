package com.vohidov.dynamicfragment

import android.os.Bundle
import android.service.media.MediaBrowserService
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_my.view.*

class MyFragment : Fragment() {

    lateinit var root: View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        root = inflater.inflate(R.layout.fragment_my, container, false)

        root.txt_fragment.text = "Muhammadumar"

        return root
    }

}