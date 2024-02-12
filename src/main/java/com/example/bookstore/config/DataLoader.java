package com.example.bookstore.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.bookstore.model.Book;
import com.example.bookstore.repository.BookRepository;

@Component
public class DataLoader implements CommandLineRunner {

    private final BookRepository bookRepository;

    public DataLoader(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) {
        // Corrected Book constructor usage
        Book book1 = new Book(0, "Title 1", "Author 1", 2000, "ISBN 1", 19.99);
        Book book2 = new Book(0, "Title 2", "Author 2", 2005, "ISBN 2", 29.99);

        bookRepository.save(book1);
        bookRepository.save(book2);
    }
}
