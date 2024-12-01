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
        switch (position) {
            case 0:
                PokemonFragment.getInstance();
                break;
            case 1:
                PokemonFragment.getInstance();
                break;
        }
        return PokemonFragment.getInstance();
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}