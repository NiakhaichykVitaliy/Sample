package com.example.sample;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class PokemonViewPagerFragment extends Fragment {
    private ViewPager2 viewPager;
    private TabLayout tabLayout;
    private PokemonViewPagerAdapter viewPagerAdapter;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.viewpager_pokemon, container, false);
        viewPager = view.findViewById(R.id.view_pager);
        tabLayout = view.findViewById(R.id.tab_layout);
        viewPagerAdapter = new PokemonViewPagerAdapter(getActivity());
        viewPager.setAdapter(viewPagerAdapter);

        new TabLayoutMediator(tabLayout, viewPager, (tab, position) -> {
            switch (position) {
                case 0:
                    tab.setText(R.string.pokemon_fragment_1);
                    tab.setIcon(R.drawable.poke_ball);
                    break;
                case 1:
                    tab.setText(R.string.pokemon_fragment_2);
                    tab.setIcon(R.drawable.poke_ball);
                    break;
            }
        }).attach();

        viewPager.setUserInputEnabled(false);
        return view;
    }

    public static PokemonViewPagerFragment getInstance() {
        return new PokemonViewPagerFragment();
    }
}