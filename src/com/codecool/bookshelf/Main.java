package com.codecool.bookshelf;

public class Main {

    public static void main(String[] args) {
        Book book = new Book("Harry Potter and the Philosopher's Stone", "J.K. Rowling", 1997, 1500, 1120);
        System.out.println(book.getBookInfo());
    }
}
