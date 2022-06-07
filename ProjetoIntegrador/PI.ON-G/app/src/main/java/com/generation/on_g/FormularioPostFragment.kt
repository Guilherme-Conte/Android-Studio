package com.generation.on_g

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class FormularioPostFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_formulario_post, container, false)
        val buttonPublicar = view.findViewById<Button>(R.id.buttonPublicar)

        buttonPublicar.setOnClickListener {
            findNavController().navigate(R.id.action_formularioPostFragment_to_postagemFragment)

        }
        return view
    }
}

