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


        books.add(new Book("The Name Of The Wind","Fantasy","800",0));
        books.add(new Book("A Dance With Dragon","Fantasy","757",0));
        books.add(new Book("A Feast For Crows","Fantasy","538",0));
        books.add(new Book("A Game Of Thrones","Fantasy","897",0));
        books.add(new Book("A Storm Of Swords","Fantasy","678",0));
        books.add(new Book("Harry Potter And The Goblet Fire","Fantasy","423",0));
        books.add(new Book("Harry Potter And The Order Of The Phoenix","Fantasy","653",0));
        books.add(new Book("Harry Potter And The Philosopher's Stone","Fantasy","231",0));
        books.add(new Book("The World Of Ice And Fire","Fantasy","582",0));



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
