package com.example.booklister;


import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

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

//        BookAdapter bookAdapter = new BookAdapter(mContext,books);
//        ListView listView = (ListView) getActivity().findViewById(R.id.bookListView);
//        listView.setAdapter(bookAdapter);

        return (ViewGroup) inflater.inflate(R.layout.book_list,container,false);

    }

}
