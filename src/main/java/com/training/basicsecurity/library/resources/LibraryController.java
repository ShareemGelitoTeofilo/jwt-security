package com.training.basicsecurity.library.resources;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("apis/library")
public class LibraryController {

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/findAllBooks")
    public List<String> findAllBooks() {
        List<String> books = new ArrayList<>();
        books.add("Book 1");
        books.add("Book 2");
        return books;
    }
}
