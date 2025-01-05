package com.example.pokemon.api

import com.example.pokemon.model.Pokemon
import com.example.pokemon.model.PokemonResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class PokemonRepository() {

    private val pokemonApi: PokemonApi = RetrofitClient.retrofit.create(PokemonApi::class.java)

    fun fetchPokemonList(callback: (Result<List<Pokemon>>) -> Unit) {

        pokemonApi.getPokemon().enqueue(object : Callback<List<PokemonResponse>> {
            override fun onResponse(
                call: Call<List<PokemonResponse>>,
                response: Response<List<PokemonResponse>>
            ) {
                if (response.isSuccessful && response.body() != null) {
                    val pokemonMapper = PokemonMapper()
                    val mapperPokemonList = pokemonMapper.mapToDomain(response.body()!!)
                    callback(Result.success(mapperPokemonList))

                } else {
                    callback(Result.failure(Exception("No data")))
                }
            }

            override fun onFailure(call: Call<List<PokemonResponse>>, t: Throwable) {
                t.printStackTrace()
                callback(Result.failure(t))
            }
        })
    }
}