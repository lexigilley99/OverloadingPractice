package org.example;

public class Books {
    private final String title;
    private final int pages;
    private final int year;

    public Books(String title, int pages, int year) {
        this.title = title;
        this.pages = pages;
        this.year = year;
    }

    public Books(String title, int pages) {
        this(title, pages, 0); // default year to 0
    }

    public Books(String title) {
        this(title, 0, 0); // default pages and year to 0
    }

    public Books() {
        this("Unknown", 0, 0); // default title to "Unknown", pages and year to 0
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Getter for pages
    public int getPages() {
        return pages;
    }

    // Getter for year
    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return title + ", " + pages + " pages, " + year;
    }
}

