package com.example.sample

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView

class NewPokemonFragment : Fragment(R.layout.fragment_pokemon) {
    private val recyclerView: RecyclerView by lazy { requireView().findViewById(R.id.recycler_view) }
    private val adapter: PokemonAdapter by lazy { PokemonAdapter() }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val pokemonList = ArrayList<Pokemon>().apply {
            add(
                Pokemon(
                    1,
                    "Picachu",
                    "https://www.film.ru/sites/default/files/images/10(186).jpg"
                )
            )
            add(
                Pokemon(
                    2,
                    "Scyther",
                    "https://www.film.ru/sites/default/files/images/Scyther.jpg"
                )
            )
            add(
                Pokemon(
                    3,
                    "Alakazam",
                    "https://www.film.ru/sites/default/files/images/mega_alakazam_by_axemeagain-d6rctml.jpg"
                )
            )
            add(
                Pokemon(
                    4,
                    "Gyarados",
                    "https://www.film.ru/sites/default/files/images/gyarados-25.jpg"
                )
            )
            add(
                Pokemon(
                    5,
                    "Gengar",
                    "https://www.film.ru/sites/default/files/images/_94_gengar_by_jackspade2012-d6jjpjx.jpg"
                )
            )
            add(
                Pokemon(
                    6,
                    "Dragonite",
                    "https://www.film.ru/sites/default/files/images/Dragonite4.jpg"
                )
            )
            add(
                Pokemon(
                    7,
                    "Blastoise",
                    "https://www.film.ru/sites/default/files/images/009_blastoise_render_by_luigicuau10-d8e6hqa.jpg"
                )
            )
            add(
                Pokemon(
                    8,
                    "Charmander",
                    "https://cdn.trend.az/2016/07/21/pokemon_210716_01.jpg"
                )
            )
            add(
                Pokemon(
                    9,
                    "Charizard",
                    "https://www.film.ru/sites/default/files/images/006Charizard_Pokemon_Ranger.jpg"
                )
            )
            add(
                Pokemon(
                    10,
                    "Bulbasaur",
                    "https://img.revda-info.ru/wp-content/uploads/2016/07/Ivysaur.png"
                )
            )
            add(
                Pokemon(
                    11,
                    "Picachu",
                    "https://www.film.ru/sites/default/files/images/10(186).jpg"
                )
            )
            add(
                Pokemon(
                    12,
                    "Scyther",
                    "https://www.film.ru/sites/default/files/images/Scyther.jpg"
                )
            )
            add(
                Pokemon(
                    13,
                    "Alakazam",
                    "https://www.film.ru/sites/default/files/images/mega_alakazam_by_axemeagain-d6rctml.jpg"
                )
            )
            add(
                Pokemon(
                    14,
                    "Gyarados",
                    "https://www.film.ru/sites/default/files/images/gyarados-25.jpg"
                )
            )
            add(
                Pokemon(
                    15,
                    "Gengar",
                    "https://www.film.ru/sites/default/files/images/_94_gengar_by_jackspade2012-d6jjpjx.jpg"
                )
            )
            add(
                Pokemon(
                    16,
                    "Dragonite",
                    "https://www.film.ru/sites/default/files/images/Dragonite4.jpg"
                )
            )
        }

        adapter.setPokemonList(pokemonList)
        recyclerView.adapter = adapter
    }

    companion object {
        fun getInstance(): NewPokemonFragment {
            return NewPokemonFragment()
        }
    }
}