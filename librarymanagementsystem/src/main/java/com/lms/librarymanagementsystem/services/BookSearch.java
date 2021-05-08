package com.lms.librarymanagementsystem.services;

import com.lms.librarymanagementsystem.entity.BookJoinEntity;

import java.util.List;

public interface BookSearch {
    List<Object> searchBooks(String author, String uuid, String bookname, String category);
}
