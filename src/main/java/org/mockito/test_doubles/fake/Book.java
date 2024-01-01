package org.mockito.test_doubles.fake;


import java.time.LocalDate;

public class Book {
    private String bookId;
    private String title;

    private LocalDate publishedDate;
    private int price;


    public Book(String bookId, String title, LocalDate publishedDate, int price) {
        this.bookId = bookId;
        this.title = title;
        this.publishedDate = publishedDate;
        this.price = price;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(LocalDate publishedDate) {
        this.publishedDate = publishedDate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
