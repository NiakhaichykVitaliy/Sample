package com.example.pokemon.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.pokemon.model.Pokemon

class PokemonViewModel : ViewModel() {

    private val _pokemonList = MutableLiveData<List<Pokemon>>()
    val pokemonList: LiveData<List<Pokemon>> = _pokemonList

    init {
        val pokemonList = listOf(
            Pokemon(
                1,
                "Pikachu",
                "https://www.film.ru/sites/default/files/images/10(186).jpg"
            ),
            Pokemon(
                2,
                "Scyther",
                "https://www.film.ru/sites/default/files/images/Scyther.jpg"
            ),
            Pokemon(
                3,
                "Alakazam",
                "https://www.film.ru/sites/default/files/images/mega_alakazam_by_axemeagain-d6rctml.jpg"
            ),
            Pokemon(
                4,
                "Gyarados",
                "https://www.film.ru/sites/default/files/images/gyarados-25.jpg"
            ),
            Pokemon(
                5,
                "Gengar",
                "https://www.film.ru/sites/default/files/images/_94_gengar_by_jackspade2012-d6jjpjx.jpg"
            ),
            Pokemon(
                6,
                "Dragonite",
                "https://www.film.ru/sites/default/files/images/Dragonite4.jpg"
            ),
            Pokemon(
                7,
                "Blastoise",
                "https://www.film.ru/sites/default/files/images/009_blastoise_render_by_luigicuau10-d8e6hqa.jpg"
            ),
            Pokemon(
                8,
                "Charmander",
                "https://cdn.trend.az/2016/07/21/pokemon_210716_01.jpg"
            ),
            Pokemon(
                9,
                "Charizard",
                "https://www.film.ru/sites/default/files/images/006Charizard_Pokemon_Ranger.jpg"
            ),
            Pokemon(
                10,
                "Bulbasaur",
                "https://img.revda-info.ru/wp-content/uploads/2016/07/Ivysaur.png"
            ),
            Pokemon(
                11,
                "Pikachu",
                "https://www.film.ru/sites/default/files/images/10(186).jpg"
            ),
            Pokemon(
                12,
                "Scyther",
                "https://www.film.ru/sites/default/files/images/Scyther.jpg"
            ),
            Pokemon(
                13,
                "Alakazam",
                "https://www.film.ru/sites/default/files/images/mega_alakazam_by_axemeagain-d6rctml.jpg"
            ),
            Pokemon(
                14,
                "Gyarados",
                "https://www.film.ru/sites/default/files/images/gyarados-25.jpg"
            ),
            Pokemon(
                15,
                "Gengar",
                "https://www.film.ru/sites/default/files/images/_94_gengar_by_jackspade2012-d6jjpjx.jpg"
            ),
            Pokemon(
                16,
                "Dragonite",
                "https://www.film.ru/sites/default/files/images/Dragonite4.jpg"
            )
        )
        _pokemonList.value = pokemonList
    }
}