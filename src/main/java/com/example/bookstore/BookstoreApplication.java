package com.example.bookstore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.bookstore.domain.Category;
import com.example.bookstore.domain.CategoryRepository;
import com.example.bookstore.model.Book;
import com.example.bookstore.repository.BookRepository;

@SpringBootApplication
public class BookstoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookstoreApplication.class, args);
    }

    @Bean
    public CommandLineRunner dataLoader(BookRepository bookRepository, CategoryRepository categoryRepository) {
        return args -> {
            Category nonfiction = new Category("Non-fiction");
            Category biography = new Category("Biography");

            categoryRepository.save(nonfiction);
            categoryRepository.save(biography);

            Book book1 = new Book("Bimbofikaatio", "Taika Mannila", 2023, "9789523931794", 26.95, nonfiction);
            Book book2 = new Book("Röyhkeästi rohkea", "Sointu Borg", 2023, "9789513248871", 28.95, nonfiction);

            bookRepository.save(book1);
            bookRepository.save(book2);
        };
    }
}

