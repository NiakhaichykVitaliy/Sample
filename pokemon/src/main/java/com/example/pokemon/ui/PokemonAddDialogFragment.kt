package com.example.pokemon.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import com.example.pokemon.R
import com.example.pokemon.databinding.DialogFragmentAddPokemonBinding

class PokemonAddDialogFragment : DialogFragment() {
    private val pokemonName: EditText by lazy {
        requireView().findViewById(R.id.add_pokemon_name_edit_text)
    }
    var onSaveCliced: ((String) -> Unit)? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val bindingBtn = DialogFragmentAddPokemonBinding.inflate(inflater, container, false)
        bindingBtn.addPokemonSaveBtn.setOnClickListener {
            val name = pokemonName.text.toString()
            if (name.isNotEmpty()) {
                onSaveCliced?.invoke(name)
                dismiss()
            } else {
                Toast.makeText(context, "Please, enter pokemon name", Toast.LENGTH_SHORT).show()
            }
        }
        bindingBtn.addPokemonCloseBtn.setOnClickListener {
            dismiss()
        }
        return bindingBtn.root
    }
}