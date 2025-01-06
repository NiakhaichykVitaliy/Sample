package com.example.pokemon.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import com.example.pokemon.R

class PokemonAddDialogFragment : DialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.dialog_fragment_add_pokemon, container, false)

        val pokemonName: EditText = view.findViewById(R.id.add_pokemon_name_edit_text)
        val saveBtn: Button = view.findViewById(R.id.add_pokemon_save_btn)
        val closeBtn: Button = view.findViewById(R.id.add_pokemon_close_btn)

        saveBtn.setOnClickListener {
            val name = pokemonName.text.toString()
            if (name.isNotEmpty()) {
                parentFragmentManager.setFragmentResult(
                    "requestKey", Bundle().apply {
                        putString("pokemonName", name)
                    }
                )
                dismiss()
            } else {
                Toast.makeText(context, "Please, enter pokemon name", Toast.LENGTH_SHORT).show()
            }
        }
        closeBtn.setOnClickListener {
            dismiss()
        }
        return view
    }
}