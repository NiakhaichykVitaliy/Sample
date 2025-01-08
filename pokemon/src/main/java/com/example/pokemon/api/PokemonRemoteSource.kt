package com.example.pokemon.api

import com.example.pokemon.model.Pokemon

interface PokemonRemoteSource {
    fun fetchPokemonList(callback: (Result<List<Pokemon>>) -> Unit)
}