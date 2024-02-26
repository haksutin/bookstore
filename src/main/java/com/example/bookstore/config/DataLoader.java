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
        Book book1 = new Book("Bimbofikaatio", "Taika Mannila", 2023, "9789523931794", 26.95);
        Book book2 = new Book("Röyhkeästi rohkea", "Sointu Borg", 2023, "9789513248871", 28.95);

        bookRepository.save(book1);
        bookRepository.save(book2);
    }
}
