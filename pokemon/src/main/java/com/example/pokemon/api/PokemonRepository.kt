package com.example.pokemon.api

import com.example.pokemon.model.Pokemon

class PokemonRepository(private val pokemonRemoteSource: PokemonRemoteSource) {

    fun fetchPokemonList(callback: (Result<List<Pokemon>>) -> Unit) {
        pokemonRemoteSource.fetchPokemonList(callback)
    }
}