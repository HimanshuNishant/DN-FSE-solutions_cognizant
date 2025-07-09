package com.library.repository;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {
    private List<String> books = new ArrayList<>();

    public void save(String book) {
        books.add(book);
        System.out.println("BookRepository: Saved '" + book + "'");
    }

    public List<String> findAll() {
        return books;
    }

    public boolean delete(String book) {
        return books.remove(book);
    }
}
