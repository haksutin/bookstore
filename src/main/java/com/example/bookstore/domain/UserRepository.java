package com.example.bookstore.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends JpaRepository <AppUser, Long> {
    AppUser findByUsername(String username);
}
