package com.example.pokemon.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.pokemon.api.PokemonApi
import com.example.pokemon.api.PokemonMapper
import com.example.pokemon.api.RetrofitClient
import com.example.pokemon.model.Pokemon
import com.example.pokemon.model.PokemonResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class PokemonViewModel : ViewModel() {
    private val _pokemonList = MutableLiveData<List<Pokemon>>()
    val pokemonList: LiveData<List<Pokemon>> = _pokemonList

    private val pokemonApi: PokemonApi = RetrofitClient.retrofit.create(PokemonApi::class.java)

    fun fetchPokemonList() {
        pokemonApi.getPokemon().enqueue(object : Callback<List<PokemonResponse>> {
            override fun onResponse(
                call: Call<List<PokemonResponse>>,
                response: Response<List<PokemonResponse>>
            ) {
                if (response.isSuccessful && response.body() != null) {
                    _pokemonList.value = PokemonMapper.mapToDomain(response.body()!!)

                } else {
                    _pokemonList.value = emptyList()
                }
            }

            override fun onFailure(call: Call<List<PokemonResponse>>, t: Throwable) {
                t.printStackTrace()
            }
        })
    }

    fun getPokemonId(): Int {
        val currentList = _pokemonList.value ?: emptyList()
        return ((currentList.maxOfOrNull { it.id } ?: (0 + 1)))
    }

    fun addPokemon(pokemon: Pokemon) {
        _pokemonList.value = _pokemonList.value.orEmpty() + pokemon
    }
}