package com.example.booklister;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;


import com.example.booklister.FantasyFragment;

public class BookPagerAdapter extends FragmentStateAdapter {
    private static final int NUM_PAGES = 3;
    private String[] titles = {"Fantasy","Code","Business"};

    public BookPagerAdapter(FragmentActivity fa){
        super(fa);
    }



    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return new FantasyFragment();
    }

    @Override
    public int getItemCount() {
        return NUM_PAGES;
    }



}