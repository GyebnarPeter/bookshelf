package com.codecool.bookshelf;

public class HardcoverBook extends Book {

    private static final int PAGE_WEIGHT = 10;
    private static final int COVER_WEIGHT = 100;

    public HardcoverBook(String title, String author, int releaseYear, int numberOfPages) {
        super(title, author, releaseYear, numberOfPages, numberOfPages * PAGE_WEIGHT + (COVER_WEIGHT * 2));
    }
}
