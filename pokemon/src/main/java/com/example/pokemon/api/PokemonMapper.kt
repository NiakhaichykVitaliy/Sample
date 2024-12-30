package com.example.pokemon.api

import com.example.pokemon.model.Pokemon
import com.example.pokemon.model.PokemonResponse

object PokemonMapper {
    fun mapToDomain(pokemonResponseList: List<PokemonResponse>): List<Pokemon> {
        return pokemonResponseList.map { response ->
            Pokemon(
                id = response.id,
                name = response.name,
                image = response.image
            )
        }
    }
}