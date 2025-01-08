package com.example.pokemon.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.pokemon.api.PokemonRemoteSource
import com.example.pokemon.api.PokemonRepository
import com.example.pokemon.api.remote.PokemonRetrofitRemoteSource
import com.example.pokemon.model.Pokemon


class PokemonViewModel : ViewModel() {
    private val _pokemonList = MutableLiveData<List<Pokemon>>()
    val pokemonList: LiveData<List<Pokemon>> = _pokemonList
    private val pokemonRemoteSource: PokemonRemoteSource = PokemonRetrofitRemoteSource()
    private val pokemonRepository = PokemonRepository(pokemonRemoteSource)

    fun fetchPokemonList() {
        pokemonRepository.fetchPokemonList { result ->
            result.onSuccess { pokemonList ->
                _pokemonList.value = pokemonList
            }
            result.onFailure { throwable ->
                throwable.printStackTrace()
                _pokemonList.value = emptyList()
            }
        }
    }
}