package com.saama.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saama.jpa.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{
}
