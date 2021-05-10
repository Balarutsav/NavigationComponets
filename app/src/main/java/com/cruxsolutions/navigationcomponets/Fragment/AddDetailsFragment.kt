package com.cruxsolutions.navigationcomponets.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.cruxsolutions.navigationcomponets.R
import com.google.android.material.button.MaterialButton


class AddDetailsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var rootView = inflater.inflate(R.layout.fragment_add_details, container, false)
        val button = rootView.findViewById<MaterialButton>(R.id.btnSave)
        val edtName = rootView.findViewById<EditText>(R.id.edtFirstName)
        val edtDetails = rootView.findViewById<EditText>(R.id.edtDetails)

        var bundle: Bundle = bundleOf(
            "name" to edtName.text.toString(),
            "Details" to edtDetails.text.toString()
        )
        button.setOnClickListener {
            findNavController().navigate(
           AddDetailsFragmentDirections.actionAddDetailsFragmentToViewDetails(name = edtName.text.toString(),details = edtDetails.text.toString())
            )
        }
        return rootView
    }


}