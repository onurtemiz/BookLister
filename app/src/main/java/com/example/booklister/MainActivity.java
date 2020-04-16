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
        books.add(new Book("The Name of the Wind","Fantasy","800",0));
        BookAdapter bookAdapter = new BookAdapter(this,books);
        ListView listView = (ListView) findViewById(R.id.bookListView);
        listView.setAdapter(bookAdapter);
    }
}
