package com.library;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryManagement {
    public static void main(String[] args) {
        ApplicationContext applicationContext  = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = (BookService) applicationContext.getBean("bookService");

        bookService.addBook("The Alchemist");
        bookService.addBook("Clean Code");
        System.out.println(bookService.getAllBooks());
        bookService.removeBook("Clean Code");
        System.out.println(bookService.getAllBooks());
    }
}