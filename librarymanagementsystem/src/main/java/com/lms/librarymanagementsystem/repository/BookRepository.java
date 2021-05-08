package com.lms.librarymanagementsystem.repository;

import com.lms.librarymanagementsystem.entity.BookEntity;
import com.lms.librarymanagementsystem.entity.BookJoinEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("bookRepository")
public interface BookRepository extends CrudRepository<BookEntity, Integer> {

    @Query(value = "select b.UUID, bookName, author, category, total_quantity, availableQuantity, edition, '' status, dueDate, borrowDate    " +
            "From book b left join borrowedbook bb on b.uuid = bb.uuid " +
            "Where b.Bookname = coalesce(:bookname,b.bookname) and b.author = coalesce(:author,b.author) and b.Category = coalesce(:category,b.Category) and b.UUID = coalesce(:uuid,b.UUID)", nativeQuery = true)
    public List<Object> join(@Param("author")String author,@Param("uuid") String uuid,@Param("bookname") String bookname,@Param("category") String category);

}