package com.codecool.bookshelf;

public class PaperbackBook extends Book {

    private static final int PAGE_WEIGHT = 10;
    private static final int COVER_WEIGHT = 20;

    public PaperbackBook(String title, String author, int releaseYear, int numberOfPages) {
        super(title, author, releaseYear, numberOfPages, numberOfPages * PAGE_WEIGHT + (COVER_WEIGHT * 2));
    }
}
