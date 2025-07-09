package org.example.service;

import org.example.repository.BookRepository;

import java.util.List;

public class BookService {

    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    public void addBook(String book){
        bookRepository.save(book);
    }

    public List<String> getAllBooks(){
        return bookRepository.findAll();
    }

    public void removeBook(String book){
        boolean removed = bookRepository.delete(book);
        System.out.println(removed ? "Removed successfully." : "Book not found.");
    }
}
