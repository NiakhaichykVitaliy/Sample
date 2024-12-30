package com.example.pokemon.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.pokemon.api.PokemonApi
import com.example.pokemon.api.RetrofitClient
import com.example.pokemon.model.Pokemon
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class PokemonViewModel : ViewModel() {
    private val _pokemonList = MutableLiveData<List<Pokemon>>()
    val pokemonList: LiveData<List<Pokemon>> = _pokemonList

    val pokemonApi: PokemonApi = RetrofitClient.retrofit.create(PokemonApi::class.java)
    fun fetchPokemonList() {
        pokemonApi.getPokemon().enqueue(object : Callback<List<Pokemon>> {
            override fun onResponse(call: Call<List<Pokemon>>, response: Response<List<Pokemon>>) {
                if (response.isSuccessful && response.body() != null) {
                    _pokemonList.value = response.body()

                } else {
                    _pokemonList.value = emptyList()
                }
            }

            override fun onFailure(call: Call<List<Pokemon>>, t: Throwable) {
                t.printStackTrace()
            }
        })
    }
}