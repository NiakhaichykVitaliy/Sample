package com.example.sample;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private PokemonAdapter adapter;
    private List<Pokemon> pokemonList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        pokemonList = new ArrayList<>();
        pokemonList.add(new Pokemon(1, getString(R.string.picachu), getString(R.string.picachu_image)));
        pokemonList.add(new Pokemon(2, getString(R.string.scyther), getString(R.string.scyther_image)));
        pokemonList.add(new Pokemon(3, getString(R.string.alakazam), getString(R.string.alakazam_image)));
        pokemonList.add(new Pokemon(4, getString(R.string.gyarados), getString(R.string.gyarados_image)));
        pokemonList.add(new Pokemon(5, getString(R.string.gendar), getString(R.string.gendar_image)));
        pokemonList.add(new Pokemon(6, getString(R.string.dragonite), getString(R.string.dragonite_image)));
        pokemonList.add(new Pokemon(7, getString(R.string.blastoise), getString(R.string.blastoise_image)));
        pokemonList.add(new Pokemon(8, getString(R.string.charizard), getString(R.string.charizard_image)));
        pokemonList.add(new Pokemon(9, getString(R.string.charmander), getString(R.string.charmander_image)));
        pokemonList.add(new Pokemon(10, getString(R.string.bulbasau), getString(R.string.bulbasau_image)));
        pokemonList.add(new Pokemon(11, getString(R.string.picachu), getString(R.string.picachu_image)));
        pokemonList.add(new Pokemon(12, getString(R.string.scyther), getString(R.string.scyther_image)));
        pokemonList.add(new Pokemon(13, getString(R.string.alakazam), getString(R.string.alakazam_image)));
        pokemonList.add(new Pokemon(14, getString(R.string.gyarados), getString(R.string.gyarados_image)));
        pokemonList.add(new Pokemon(15, getString(R.string.gendar), getString(R.string.gendar_image)));
        pokemonList.add(new Pokemon(16, getString(R.string.dragonite), getString(R.string.dragonite_image)));

        adapter = new PokemonAdapter(pokemonList);
        recyclerView.setAdapter(adapter);
    }

    static void startMainActivity(Context context) {
        Intent intent = new Intent(context, MainActivity.class);
        context.startActivity(intent);
    }
}