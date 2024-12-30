package com.example.pokemon.api

import com.example.pokemon.model.PokemonResponse
import retrofit2.Call
import retrofit2.http.GET

interface PokemonApi {
    @GET("v1/76ac942a-a183-4522-87a9-16c2ef295a85")
    fun getPokemon(): Call<List<PokemonResponse>>
}