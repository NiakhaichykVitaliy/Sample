package com.example.pokemon.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.RecyclerView
import com.example.pokemon.R
import com.example.pokemon.viewmodel.PokemonViewModel

class NewPokemonFragment : Fragment(R.layout.fragment_pokemon) {
    private val recyclerView: RecyclerView by lazy { requireView().findViewById(R.id.recycler_view) }
    private val adapter: PokemonAdapter by lazy { PokemonAdapter() }

    private val pokemonViewModel: PokemonViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        pokemonViewModel.pokemonList.observe(
            viewLifecycleOwner,
            Observer { pokemonList -> adapter.setPokemonList(pokemonList) })

        recyclerView.adapter = adapter
        pokemonViewModel.fetchPokemonList()
    }

    companion object {
        fun getInstance(): NewPokemonFragment {
            return NewPokemonFragment()
        }
    }
}