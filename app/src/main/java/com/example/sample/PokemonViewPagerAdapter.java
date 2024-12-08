package com.example.sample;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class PokemonViewPagerAdapter extends FragmentStateAdapter {

    public PokemonViewPagerAdapter(FragmentActivity fragment) {
        super(fragment);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if (position == 0) {
            return NewPokemonFragment.Companion.getInstance();
        } else if (position == 1) {
            return PokemonFragment.getInstance();
        }
        return PokemonFragment.getInstance();
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}