package com.lms.librarymanagementsystem.services.impl;

import com.lms.librarymanagementsystem.entity.BookJoinEntity;
import com.lms.librarymanagementsystem.repository.BookRepository;
import com.lms.librarymanagementsystem.services.BookSearch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;


@Service("BookSearch")
public class BookSearchImpl implements BookSearch {

    @Autowired
    BookRepository bookRepository;
    @Override
    public List<Object> searchBooks(String author, String uuid, String bookname, String category) {
        List<Object> books = bookRepository.join(author, uuid, bookname, category);

//        for (BookJoinEntity b : books) {
//
//            if (b.getDueDate().after(new Date())) {
//                b.setStatus("OVERDUE");
//            }
//            //else if (b.getDueDate()) {
//              //If null then   b.setStatus("BORROWED");
//            //}
//            else {
//
//            }
//
//        }

        return books;
    }
}
