package com.example.booklister;

public class Book {
    private String bookName;
    private String bookType;
    private String bookPages;
    private int bookImage;

    public Book (String name, String type, String pages, int image){
        bookName = name;
        bookType = type;
        bookPages = pages;
        bookImage = image;
    }

    public int getBookImage() {
        return bookImage;
    }

    public String getBookName() {
        return bookName;
    }

    public String getBookPages() {
        return bookPages;
    }

    public String getBookType() {
        return bookType;
    }
}
