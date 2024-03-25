package com.example.bookstore;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.bookstore.web.BookController;
import com.example.bookstore.web.CategoryController;

@SpringBootTest
public class BookstoreApplicationTests {

	@Autowired
	private BookController controller;

	@Autowired
	private CategoryController catcontroller;

	@Test
	void contextLoads() throws Exception {
		assertThat(controller).isNotNull();
		assertThat(catcontroller).isNotNull();
	}

}
