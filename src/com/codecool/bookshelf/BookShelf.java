package com.codecool.bookshelf;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BookShelf {

    List<Book> books;

    public void addBook(Book book) {
        books.add(book);
    }

    /*public List<Book> getBooks(int year) {
        List<Book> bookByYear = new ArrayList<>();
        for (Book book: books) {
            if (book.getReleaseYear() == year) {
                bookByYear.add(book);
            }
        }
        return bookByYear;
    }*/

    public List<Book> getBooks(int year) {
        return books.stream().filter(item -> item.getReleaseYear() == year).collect(Collectors.toList());
    }

    public String getLightestAuthor() {
        return books.stream().min(Comparator.comparing(Book::getWeightInGram)).get().getAuthor();
    }


    /*Legyen egy printBooks() függvénye, ami kiírja az összes könyv adatát. Soronként kiírja a könyvek getBookInfo() visszatérési értékét
    Figyelj a bemeneti paraméter validálására is!*/
}
