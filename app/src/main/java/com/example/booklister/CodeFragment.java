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
public class CodeFragment extends Fragment {
    private List<Book> books =  new ArrayList<Book>();;
    private Context mContext;


    public CodeFragment() {
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


        books.add(new Book("The Pragmatic Programmer: From Journeyman to Master","Andy Hunt","321",R.drawable.the_pragmatic_programmer));
        books.add(new Book("Clean Code: A Handbook of Agile Software Craftsmanship","Robert C. Martin","434",R.drawable.clean_code));
        books.add(new Book("Design Patterns: Elements of Reusable Object-Oriented Software","Erich Gamma","416",R.drawable.design_patterns));
        books.add(new Book("Refactoring: Improving the Design of Existing Code","Erich Gamma","431",R.drawable.refactoring));
        books.add(new Book("The C Programming Language","Dennis M. Ritchie","288",R.drawable.the_c_programming_language));
        books.add(new Book("JavaScript: The Good Parts","Douglas Crockford","153",R.drawable.javascript));
        books.add(new Book("Head First Design Patterns","Elisabeth Robson","638",R.drawable.head_first_design_patterns));
        books.add(new Book("The Clean Coder: A Code of Conduct for Professional Programmers","Robert C. Martin","210",R.drawable.the_clean_coder));



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
