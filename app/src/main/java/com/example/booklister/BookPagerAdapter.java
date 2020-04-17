package com.example.booklister;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.booklister.FantasyFragment;

public class BookPagerAdapter extends FragmentPagerAdapter {
    private static final int NUM_PAGES = 3;

    public BookPagerAdapter(FragmentManager fm){
        super(fm);
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        return new FantasyFragment();
    }

    @Override
    public int getCount() {
        return NUM_PAGES;
    }
}