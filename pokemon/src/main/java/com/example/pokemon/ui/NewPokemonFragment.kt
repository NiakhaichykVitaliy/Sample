package com.example.pokemon.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.RecyclerView
import com.example.pokemon.R
import com.example.pokemon.viewmodel.PokemonViewModel
import com.google.android.material.floatingactionbutton.FloatingActionButton


class NewPokemonFragment : Fragment(R.layout.new_fragment_pokemon) {
    private val recyclerView: RecyclerView by lazy { requireView().findViewById(R.id.recycler_view) }
    private val adapter: PokemonAdapter by lazy { PokemonAdapter() }
    private val pokemonAddFab: FloatingActionButton by lazy { requireView().findViewById(R.id.fab_add_pokemon) }
    private val pokemonViewModel: PokemonViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        pokemonViewModel.pokemonList.observe(
            viewLifecycleOwner,
            Observer { pokemonList -> adapter.setPokemonList(pokemonList) })

        recyclerView.adapter = adapter

        pokemonAddFab.setOnClickListener {
            openAddPokemonDialog()
        }

        pokemonViewModel.fetchPokemonList()
    }

    private fun openAddPokemonDialog() {
        val dialogFragment = AddPokemonDialogFragment()
        parentFragmentManager.setFragmentResultListener(
            AddPokemonDialogFragment.REQUEST_NAME,
            viewLifecycleOwner,
        ) { _, bundle ->
            val pokemonName = bundle.getString(AddPokemonDialogFragment.POKEMON_NAME)
            pokemonName?.let {
                pokemonViewModel.addPokemon(it)
            }
        }
        dialogFragment.show(parentFragmentManager, null)
    }

    companion object {
        fun getInstance(): NewPokemonFragment {
            return NewPokemonFragment()
        }
    }
}