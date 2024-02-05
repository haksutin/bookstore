package com.example.bookstore.model;

public class Book {

    private long id;
    private String title;
    private String authog;
    private int publicationYear;
    private String isbn;
    private double price;
    
    public Book(long id, String title, String authog, int publicationYear, String isbn, double price) {
        this.id = id;
        this.title = title;
        this.authog = authog;
        this.publicationYear = publicationYear;
        this.isbn = isbn;
        this.price = price;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthog() {
        return authog;
    }
    public void setAuthog(String authog) {
        this.authog = authog;
    }
    public int getPublicationYear() {
        return publicationYear;
    }
    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

}


