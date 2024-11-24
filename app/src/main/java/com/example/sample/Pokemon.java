package com.example.sample;

public class Pokemon {
    private int id;
    private String namePokemon;
    private String imagePokemon;

    public Pokemon(int id, String namePokemon, String imagePokemon) {
        this.id = id;
        this.namePokemon = namePokemon;
        this.imagePokemon = imagePokemon;
    }

    public String getNamePokemon() {
        return namePokemon;
    }

    public String getImagePokemon() {
        return imagePokemon;
    }
}