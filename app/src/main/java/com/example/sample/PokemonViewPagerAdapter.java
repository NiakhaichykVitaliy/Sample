package com.example.sample;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;
import java.util.List;

public class PokemonViewPagerAdapter extends FragmentStateAdapter {
    List<Pokemon> pokemonList = new ArrayList<>();

    public PokemonViewPagerAdapter(FragmentActivity fragment) {
        super(fragment);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if (position == 0) {
            PokemonFragment.getInstance();
        } else if (position == 1) {
            PokemonFragment.getInstance();
        }
        return PokemonFragment.getInstance();
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}