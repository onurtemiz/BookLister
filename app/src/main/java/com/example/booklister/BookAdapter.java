package com.example.booklister;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class BookAdapter extends ArrayAdapter<Book> {


    public BookAdapter(@NonNull Context context, @NonNull List<Book> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View rootView = convertView;
        if (rootView == null){
            rootView = LayoutInflater.from(getContext()).inflate(R.layout.book,parent,false);
        }
        Book book = getItem(position);

        TextView bookName = (TextView) rootView.findViewById(R.id.bookName);
        bookName.setText("Name :" + book.getBookName());

        TextView bookType = (TextView) rootView.findViewById(R.id.bookType);
        bookType.setText("Type: " + book.getBookType());

        TextView bookPages = (TextView) rootView.findViewById(R.id.bookPage);
        bookPages.setText("Pages: " + book.getBookPages());

        return rootView;





    }
}
