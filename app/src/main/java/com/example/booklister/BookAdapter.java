package com.example.booklister;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import java.io.Serializable;
import java.util.List;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.ViewHolder> {


    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView bookName;
        public TextView bookType;
        public TextView bookPages;
        public ImageView bookImage;

        public ViewHolder(View itemView){
            super(itemView);
            bookName = (TextView) itemView.findViewById(R.id.bookName);
            bookType = (TextView) itemView.findViewById(R.id.bookType);
            bookPages = (TextView) itemView.findViewById(R.id.bookPage);
            bookImage = (ImageView) itemView.findViewById(R.id.bookCover);

        }
    }

    private List<Book> books;
    private View con;
    private Context c;

    public BookAdapter(List<Book> b){
        books = b;
    }


    @Override
    public BookAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        final Context mContext = parent.getContext();
        c = mContext;
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View contactView = inflater.inflate(R.layout.book,parent,false);
        con = contactView;
        ViewHolder viewHolder = new ViewHolder(contactView);



        return viewHolder;

    }

    @Override
    public void onBindViewHolder(BookAdapter.ViewHolder viewHolder,int position){
        Book book = books.get(position);
        TextView bookName = viewHolder.bookName;
        bookName.setText("Name: " + book.getBookName());
        TextView bookType = viewHolder.bookType;
        bookType.setText("Author: " + book.getBookType());
        TextView bookPages = viewHolder.bookPages;
        bookPages.setText("Pages: " + book.getBookPages());
        ImageView bookImage = viewHolder.bookImage;
        if(book.getBookImage() != 0){
        bookImage.setImageResource(book.getBookImage());}

        final int p = position;
        con.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(c,BookDetailActivity.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("books", (Serializable) books);
                bundle.putInt("pos",p);
                i.putExtras(bundle);
                c.startActivity(i);
            }
        });


    }

    @Override
    public int getItemCount(){
        return books.size();
    }
}
