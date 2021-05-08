package com.lms.librarymanagementsystem.controller;

import com.lms.librarymanagementsystem.entity.BookJoinEntity;
import com.lms.librarymanagementsystem.entity.BookSearchInput;
import com.lms.librarymanagementsystem.services.BookSearch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.Console;
import java.util.List;

@RestController
@RequestMapping("/books")
public class SearchController {
    @Autowired
    BookSearch bookSearch;
    @RequestMapping( value= "/searchbooks",method = RequestMethod.POST)
    public ResponseEntity<List<Object>> searchBooks(@RequestBody BookSearchInput bookSearchInput)
    {
        ResponseEntity<List<Object>> resultObj = null;
        try {
            List<Object> results = bookSearch.searchBooks(bookSearchInput.getAuthor(), bookSearchInput.getUuid(), bookSearchInput.getBookName(), bookSearchInput.getCategory());

            resultObj = new ResponseEntity<>(results, HttpStatus.OK);
        }
        catch (Exception ex)
        {

            //log exception
            resultObj= new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return resultObj;


    }
}
