package com.cruxsolutions.navigationcomponets.Fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.cruxsolutions.navigationcomponets.R


class ViewDetails : Fragment() {
    var name: String = ""
    var details: String = ""
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val args:ViewDetailsArgs by navArgs()
        val root = inflater.inflate(R.layout.fragment_view_details, container, false)
        root.apply {
            this.findViewById<TextView>(R.id.tvFirstName).text = args.name
            this.findViewById<TextView>(R.id.tvDetails).text =args.details
        }
        return root;
    }


}