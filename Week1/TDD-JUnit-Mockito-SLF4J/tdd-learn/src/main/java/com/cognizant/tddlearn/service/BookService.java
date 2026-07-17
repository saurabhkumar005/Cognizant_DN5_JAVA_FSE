package com.cognizant.tddlearn.service;

import com.cognizant.tddlearn.repository.BookRepository;

public class BookService {
    private BookRepository repository;

    public BookService(BookRepository repository) {
        this.repository = repository;
    }

    public String getBookTitle(int id) {
        return repository.findBookById(id);
    }
}