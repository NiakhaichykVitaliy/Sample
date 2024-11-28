package com.example.sample;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.appcompat.widget.Toolbar;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class PokemonFragment extends Fragment {
    private RecyclerView recyclerView;
    private PokemonAdapter adapter;
    private Toolbar toolbar;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState) {
        View view = inflater.inflate(R.layout.fragment_pokemon, container, false);

        toolbar = view.findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.title_list_pokemon);

        recyclerView = view.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        List<Pokemon> pokemonList = new ArrayList<>();
        pokemonList.add(new Pokemon(1, "Picachu", "https://www.film.ru/sites/default/files/images/10(186).jpg"));
        pokemonList.add(new Pokemon(2, "Scyther", "https://www.film.ru/sites/default/files/images/Scyther.jpg"));
        pokemonList.add(new Pokemon(3, "Alakazam", "https://www.film.ru/sites/default/files/images/mega_alakazam_by_axemeagain-d6rctml.jpg"));
        pokemonList.add(new Pokemon(4, "Gyarados", "https://www.film.ru/sites/default/files/images/gyarados-25.jpg"));
        pokemonList.add(new Pokemon(5, "Gendar", "https://www.film.ru/sites/default/files/images/_94_gengar_by_jackspade2012-d6jjpjx.jpg"));
        pokemonList.add(new Pokemon(6, "Dragonite", "https://www.film.ru/sites/default/files/images/Dragonite4.jpg"));
        pokemonList.add(new Pokemon(7, "Blastoise", "https://www.film.ru/sites/default/files/images/009_blastoise_render_by_luigicuau10-d8e6hqa.jpg"));
        pokemonList.add(new Pokemon(8, "Charmander", "https://cdn.trend.az/2016/07/21/pokemon_210716_01.jpg"));
        pokemonList.add(new Pokemon(9, "Charizard", "https://www.film.ru/sites/default/files/images/006Charizard_Pokemon_Ranger.jpg"));
        pokemonList.add(new Pokemon(10, "Bulbasau", "https://img.revda-info.ru/wp-content/uploads/2016/07/Ivysaur.png"));
        pokemonList.add(new Pokemon(11, "Picachu", "https://www.film.ru/sites/default/files/images/10(186).jpg"));
        pokemonList.add(new Pokemon(12, "Scyther", "https://www.film.ru/sites/default/files/images/Scyther.jpg"));
        pokemonList.add(new Pokemon(13, "Alakazam", "https://www.film.ru/sites/default/files/images/mega_alakazam_by_axemeagain-d6rctml.jpg"));
        pokemonList.add(new Pokemon(14, "Gyarados", "https://www.film.ru/sites/default/files/images/gyarados-25.jpg"));
        pokemonList.add(new Pokemon(15, "Gendar", "https://www.film.ru/sites/default/files/images/_94_gengar_by_jackspade2012-d6jjpjx.jpg"));
        pokemonList.add(new Pokemon(16, "Dragonite", "https://www.film.ru/sites/default/files/images/Dragonite4.jpg"));

        adapter = new PokemonAdapter();
        adapter.setPokemonList(pokemonList);
        recyclerView.setAdapter(adapter);

        return view;
    }

    private static PokemonFragment instance;

    public static PokemonFragment getInstance() {
        if (instance == null) {
            instance = new PokemonFragment();

        }
        return instance;
    }
}