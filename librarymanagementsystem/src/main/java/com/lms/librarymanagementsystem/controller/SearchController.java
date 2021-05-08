package com.lms.librarymanagementsystem.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books/")
public class SearchController {
    @RequestMapping( value= "/hello" )
    public String sayHello(@RequestParam("name") String name)
    {
        return "Hello " + name;
    }
}
