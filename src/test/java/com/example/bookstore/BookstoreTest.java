package com.example.bookstore;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.bookstore.domain.AppUser;
import com.example.bookstore.domain.Category;
import com.example.bookstore.domain.CategoryRepository;
import com.example.bookstore.domain.UserRepository;
import com.example.bookstore.model.Book;
import com.example.bookstore.repository.BookRepository;

@SpringBootTest
public class BookstoreTest {

    @Autowired
    private BookRepository bRepository;

    @Autowired
    private CategoryRepository cRepository;

    @Autowired
    private UserRepository uRepository;

    @Test
    public void testBookRepository() {
        bRepository.save(new Book("Harry Potter ja viisasten kivi", "J.K. Rowling", 2018, "9789520401801", 24.95, null));
        
        List<Book> foundBook = bRepository.findByTitle("Harry Potter ja viisasten kivi");
        assertThat(foundBook).isNotNull();

        bRepository.delete(foundBook.get(0));
        assertThat(bRepository.findByTitle("Harry Potter ja viisasten kivi")).isNotNull();
    }

    @Test
    public void testCategoryRepository() {
        cRepository.save(new Category("Fiction"));

        List<Category> foundCategory = cRepository.findByName("Fiction");
        assertThat(foundCategory).isNotNull();

        cRepository.delete(foundCategory.get(0));
        assertThat(cRepository.findByName("Fiction")).isEmpty();
    }
    @Test
    public void testUserRepository() {
        uRepository.save(new AppUser("test", "test@email.com", "test", "USER"));

        AppUser foundUser = uRepository.findByUsername("test");
        assertThat(foundUser).isNotNull();

        uRepository.delete(foundUser);
        assertThat(uRepository.findByUsername("test")).isNull();
    }
}
