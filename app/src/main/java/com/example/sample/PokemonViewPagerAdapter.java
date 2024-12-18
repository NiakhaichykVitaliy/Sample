package com.example.sample;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.pokemon.ui.NewPokemonFragment;
import com.example.pokemon.ui.PokemonFragment;

public class PokemonViewPagerAdapter extends FragmentStateAdapter {

    public PokemonViewPagerAdapter(FragmentActivity fragment) {
        super(fragment);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return switch (position) {
            case 1 -> PokemonFragment.getInstance();
            default -> NewPokemonFragment.Companion.getInstance();
        };
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}