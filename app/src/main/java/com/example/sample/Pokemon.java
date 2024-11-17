package com.example.sample;

public class Pokemon {
    int id;
    String namePokemon;
    String imagePokemon;

    public Pokemon(int id, String namePokemon, String imagePokemon) {
        this.id = id;
        this.namePokemon = namePokemon;
        this.imagePokemon = imagePokemon;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamePokemon() {
        return namePokemon;
    }

    public void setNamePokemon(String namePokemon) {
        this.namePokemon = namePokemon;
    }

    public String getImagePokemon() {
        return imagePokemon;
    }

    public void setImagePokemon(String imagePokemon) {
        this.imagePokemon = imagePokemon;
    }
}
