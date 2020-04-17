package com.example.booklister;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class BookDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bookdetail);
        Intent intent = this.getIntent();
        Bundle bundle = intent.getExtras();
        List<Book> books = (List<Book>) bundle.getSerializable("books");
        Book book = books.get(bundle.getInt("pos"));

        TextView bookName = (TextView) findViewById(R.id.bookNameDetail);
        bookName.setText(book.getBookName());

        TextView bookType = (TextView) findViewById(R.id.bookTypeDetail);
        bookType.setText(book.getBookType());

        TextView bookPages = (TextView) findViewById(R.id.bookPagesDetail);
        bookPages.setText(book.getBookPages());

        ImageView bookImage = (ImageView) findViewById(R.id.bookCoverDetail);
        bookImage.setImageResource(book.getBookImage());

    }
}
