package com.example.booklister;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Book> books =  new ArrayList<Book>();;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book_list);

        books.add(new Book("The Name Of The Wind","Fantasy","800",0));
        books.add(new Book("A Dance With Dragon","Fantasy","757",0));
        books.add(new Book("A Feast For Crows","Fantasy","538",0));
        books.add(new Book("A Game Of Thrones","Fantasy","897",0));
        books.add(new Book("A Storm Of Swords","Fantasy","678",0));
        books.add(new Book("Harry Potter And The Goblet Fire","Fantasy","423",0));
        books.add(new Book("Harry Potter And The Order Of The Phoenix","Fantasy","653",0));
        books.add(new Book("Harry Potter And The Philosopher's Stone","Fantasy","231",0));
        books.add(new Book("The World Of Ice And Fire","Fantasy","582",0));


        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.bookListView);
        System.out.println(recyclerView.toString());
        BookAdapter bookAdapter = new BookAdapter(books);
        recyclerView.setAdapter(bookAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));



    }
}
