package com.example.homework161colorsfragment

import Utils.MyData
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_main.view.*

class MainFragment : Fragment() {

    lateinit var root: View

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        root = inflater.inflate(R.layout.fragment_main, container, false)

        root.btn_EditColor.setOnClickListener {
            fragmentManager?.beginTransaction()?.replace(R.id.liner_container, EditColorFragment())
                    ?.addToBackStack(null)?.commit()
        }
        return root
    }

    override fun onStart() {
        super.onStart()
        root.setBackgroundColor(resources.getColor(MyData.color))
    }
}