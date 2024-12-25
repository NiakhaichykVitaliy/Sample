package com.example.pokemon.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.pokemon.api.PokemonApi
import com.example.pokemon.model.Pokemon
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

private const val BASE_URL = "https://mocki.io/"

class PokemonViewModel : ViewModel() {
    private val _pokemonList = MutableLiveData<List<Pokemon>>()
    val pokemonList: LiveData<List<Pokemon>> = _pokemonList

    private val retrofit: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    val pokemonApi: PokemonApi = retrofit.create(PokemonApi::class.java)
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