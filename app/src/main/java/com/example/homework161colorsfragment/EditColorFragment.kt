package com.example.homework161colorsfragment

import Utils.MyData
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_edit_color.*
import kotlinx.android.synthetic.main.fragment_edit_color.view.*
import kotlinx.android.synthetic.main.fragment_main.view.*

class EditColorFragment : Fragment() {

    lateinit var root1: View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        root1 = inflater.inflate(R.layout.fragment_edit_color, container, false)

        root1.bir.setOnClickListener {
            MyData.color = R.color.red
            Toast.makeText(context, "Clicked", Toast.LENGTH_SHORT).show()
            fragmentManager?.beginTransaction()?.replace(R.id.liner_container, MainFragment())
                    ?.addToBackStack(null)?.commit()
        }
        root1.sariqq.setOnClickListener {
            MyData.color = R.color.orange
            Toast.makeText(context, "Clicked", Toast.LENGTH_SHORT).show()
            fragmentManager?.beginTransaction()?.replace(R.id.liner_container, MainFragment())
                    ?.addToBackStack(null)?.commit()
        }
        root1.yashill.setOnClickListener {
            MyData.color = R.color.green
            Toast.makeText(context, "Clicked", Toast.LENGTH_SHORT).show()
            fragmentManager?.beginTransaction()?.replace(R.id.liner_container, MainFragment())
                    ?.addToBackStack(null)?.commit()
        }

        root1.havorang.setOnClickListener {
            MyData.color = R.color.btn4
            Toast.makeText(context, "Clicked", Toast.LENGTH_SHORT).show()
            fragmentManager?.beginTransaction()?.replace(R.id.liner_container, MainFragment())
                    ?.addToBackStack(null)?.commit()
        }
        root1.toqhavo.setOnClickListener {
            MyData.color = R.color.toqhavo
            Toast.makeText(context, "Clicked", Toast.LENGTH_SHORT).show()
            fragmentManager?.beginTransaction()?.replace(R.id.liner_container, MainFragment())
                    ?.addToBackStack(null)?.commit()
        }
        root1.kok.setOnClickListener {
            MyData.color = R.color.blue
            Toast.makeText(context, "Clicked", Toast.LENGTH_SHORT).show()
            fragmentManager?.beginTransaction()?.replace(R.id.liner_container, MainFragment())
                    ?.addToBackStack(null)?.commit()
        }
        root1.btn7.setOnClickListener {
            MyData.color = R.color.btn7
            Toast.makeText(context, "Clicked", Toast.LENGTH_SHORT).show()
            fragmentManager?.beginTransaction()?.replace(R.id.liner_container, MainFragment())
                    ?.addToBackStack(null)?.commit()
        }
        root1.btn8.setOnClickListener {
            MyData.color = R.color.btn8
            Toast.makeText(context, "Clicked", Toast.LENGTH_SHORT).show()
            fragmentManager?.beginTransaction()?.replace(R.id.liner_container, MainFragment())
                    ?.addToBackStack(null)?.commit()
        }
        root1.btn9.setOnClickListener {
            MyData.color = R.color.btn9
            Toast.makeText(context, "Clicked", Toast.LENGTH_SHORT).show()
            fragmentManager?.beginTransaction()?.replace(R.id.liner_container, MainFragment())
                    ?.addToBackStack(null)?.commit()
        }
        root1.btn10.setOnClickListener {
            MyData.color = R.color.btn10
            Toast.makeText(context, "Clicked", Toast.LENGTH_SHORT).show()
            fragmentManager?.beginTransaction()?.replace(R.id.liner_container, MainFragment())
                    ?.addToBackStack(null)?.commit()
        }
        root1.btn11.setOnClickListener {
            MyData.color = R.color.btn11
            Toast.makeText(context, "Clicked", Toast.LENGTH_SHORT).show()
            fragmentManager?.beginTransaction()?.replace(R.id.liner_container, MainFragment())
                    ?.addToBackStack(null)?.commit()
        }
        root1.btn12.setOnClickListener {
            MyData.color = R.color.btn12
            Toast.makeText(context, "Clicked", Toast.LENGTH_SHORT).show()
            fragmentManager?.beginTransaction()?.replace(R.id.liner_container, MainFragment())
                    ?.addToBackStack(null)?.commit()
        }
//        root1.save_color.setOnClickListener {
//            fragmentManager?.beginTransaction()?.replace(R.id.liner_container, MainFragment())
//                    ?.addToBackStack(null)?.commit()
//            Toast.makeText(context, "Clicked", Toast.LENGTH_SHORT).show()
//
//        }



        return root1
    }
}

