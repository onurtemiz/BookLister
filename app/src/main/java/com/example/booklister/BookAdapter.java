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
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.ViewHolder> {


    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView bookName;

        public ViewHolder(View itemView){
            super(itemView);
            bookName = (TextView) itemView.findViewById(R.id.bookName);

        }
    }

    private List<Book> books;

    public BookAdapter(List<Book> b){
        books = b;
    }

    @Override
    public BookAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View contactView = inflater.inflate(R.layout.book,parent,false);
        ViewHolder viewHolder = new ViewHolder(contactView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(BookAdapter.ViewHolder viewHolder,int position){
        Book book = books.get(position);
        TextView bookName = viewHolder.bookName;
        bookName.setText(book.getBookName());
    }

    @Override
    public int getItemCount(){
        return books.size();
    }
}
