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
import com.example.pokemon.utils.Constants

class AddPokemonDialogFragment : DialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.dialog_fragment_add_pokemon, container, false)

        val pokemonNameEditText: EditText = view.findViewById(R.id.add_pokemon_name_edit_text)
        val saveButton: Button = view.findViewById(R.id.add_pokemon_save_button)
        val closeButton: Button = view.findViewById(R.id.add_pokemon_close_button)

        saveButton.setOnClickListener {
            val name = pokemonNameEditText.text.toString()
            if (name.isNotEmpty()) {
                parentFragmentManager.setFragmentResult(
                    Constants.REQUEST_NAME, Bundle().apply {
                        putString(Constants.POKEMON_NAME, name)
                    }
                )
                dismiss()
            } else {
                Toast.makeText(
                    context,
                    getString(R.string.dialog_fragment_enter_pokemon_name), Toast.LENGTH_SHORT
                ).show()
            }
        }
        closeButton.setOnClickListener {
            dismiss()
        }
        return view
    }
}