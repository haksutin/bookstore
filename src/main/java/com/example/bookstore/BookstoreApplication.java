package com.example.bookstore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.bookstore.domain.AppUser;
import com.example.bookstore.domain.Category;
import com.example.bookstore.domain.CategoryRepository;
import com.example.bookstore.domain.UserRepository;
import com.example.bookstore.model.Book;
import com.example.bookstore.repository.BookRepository;

@SpringBootApplication
public class BookstoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookstoreApplication.class, args);
    }

    @Bean
    public CommandLineRunner dataLoader(BookRepository bookRepository, CategoryRepository categoryRepository, UserRepository userRepository) {
        return args -> {
            Category nonfiction = new Category("Non-fiction");
            Category biography = new Category("Biography");

            categoryRepository.save(nonfiction);
            categoryRepository.save(biography);

            Book book1 = new Book("Bimbofikaatio", "Taika Mannila", 2023, "9789523931794", 26.95, nonfiction);
            Book book2 = new Book("Röyhkeästi rohkea", "Sointu Borg", 2023, "9789513248871", 28.95, nonfiction);

            bookRepository.save(book1);
            bookRepository.save(book2);

            AppUser user1 = new AppUser("user", "$2a$10$ko0aX0ZYYNMEQfcCYjVdQugSGw1MQ9AOmBgKYiV00Crljj/0HDwDC", "user@email.com", "USER");
            AppUser user2 = new AppUser("admin", "$2a$10$8zC89hO334ZNrWtYiRzIEeCjzIBzXVSz35yVLQS3clyp6F2zFM9Km", "admin@email.com", "ADMIN");

            userRepository.save(user1);
            userRepository.save(user2);
        };
    }
}

