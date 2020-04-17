package com.example.booklister;


import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class FantasyFragment extends Fragment {
    private List<Book> books =  new ArrayList<Book>();;
    private Context mContext;


    public FantasyFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        mContext = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        books.add(new Book("The Name Of The Wind","Patrick Rothfuss","800",R.drawable.the_name_of_the_wind));
        books.add(new Book("A Dance With Dragon","G.R.R Martin","757",R.drawable.a_dance_with_dragon));
        books.add(new Book("A Feast For Crows","G.R.R Martin","538",R.drawable.a_feast_for_crows));
        books.add(new Book("A Game Of Thrones","G.R.R Martin","897",R.drawable.a_game_of_thrones));
        books.add(new Book("A Storm Of Swords","G.R.R Martin","678",R.drawable.a_storm_of_swords));
        books.add(new Book("Harry Potter And The Goblet Fire","J.K Rowling","423",R.drawable.harry_potter_and_the_goblet_fire));
        books.add(new Book("Harry Potter And The Order Of The Phoenix","J.K Rowling","653",R.drawable.harry_potter_and_the_order_of_phoenix));
        books.add(new Book("Harry Potter And The Philosopher's Stone","J.K Rowling","231",R.drawable.harry_potter_and_the_philosophers_stone));
        books.add(new Book("The World Of Ice And Fire","J.K Rowling","582",R.drawable.the_world_of_ice_and_fire));



        return (ViewGroup) inflater.inflate(R.layout.book_list,container,false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ViewPager2 viewPager = (ViewPager2) getView().findViewById(R.id.pager);
        RecyclerView recyclerView = (RecyclerView) getView().findViewById(R.id.bookListView);
        BookAdapter bookAdapter = new BookAdapter(books);
        recyclerView.setAdapter(bookAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));



    }
}
