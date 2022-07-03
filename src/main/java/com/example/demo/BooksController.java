package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {

//    @GetMapping("/books")
//    public List<Book> getAllBooks() {
//        return Arrays.asList(
//                new Book(1l, "Mastering Spring 5.2", "Ranga Karanam"),
//                new Book(2l, "Mastering Spring 5.2", "Ranga Karanam"));
//    }


    @GetMapping("/math")
    public String getMath() {
         return "I am in math you can [erfprm you ";
    }
}