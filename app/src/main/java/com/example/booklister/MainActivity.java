package com.example.booklister;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ListView;

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
        BookAdapter bookAdapter = new BookAdapter(this,books);
        ListView listView = (ListView) findViewById(R.id.bookListView);
        listView.setAdapter(bookAdapter);
    }
}
