package com.example.booklister;


import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class BusinessFragment extends Fragment {
    private List<Book> books =  new ArrayList<Book>();;
    private Context mContext;


    public BusinessFragment() {
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


        books.add(new Book("Rich Dad, Poor Dad","Sharon Lechter","195",R.drawable.rich_dad_poor_dad));
        books.add(new Book("The Lean Startup: How Today's Entrepreneurs Use Continuous Innovation to Create Radically Successful Businesses","Eric Ries","299",R.drawable.the_lean_startup));
        books.add(new Book("Zero to One: Notes on Startups, or How to Build the Future","Peter Thiel","195",R.drawable.zero_to_one));
        books.add(new Book("How to Win Friends and Influence People","Dale Carnegie","288",R.drawable.how_to_win_friends));
        books.add(new Book("The Tipping Point: How Little Things Can Make a Big Difference","Malcolm Gladwell","301",R.drawable.the_tipping_point));
        books.add(new Book("The 4-Hour Workweek","Timothy Ferriss","308",R.drawable.the_four_hour_a_week));
        books.add(new Book("The 7 Habits of Highly Effective People: Powerful Lessons in Personal Change","Jim Collins","372",R.drawable.the_seven_habit));
        books.add(new Book("Rework","David Heinemeier Hansson","279",R.drawable.rework));


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
