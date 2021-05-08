package com.lms.librarymanagementsystem.entity;

import java.util.Date;

public class BookJoinEntity implements java.io.Serializable{
    private String		UUID	;
    private String		bookName	;
    private String Author;
    private String		category	;
    private int		    total_quantity	;
    private int		    availableQuantity	;
    private String Edition;
    private String Status;
    private Date dueDate;
    private Date borrowDate;

    public BookJoinEntity(String UUID, String bookName, String author, String category, int total_quantity, int availableQuantity, String edition, String status, Date dueDate, Date borrowDate) {
        this.UUID = UUID;
        this.bookName = bookName;
        this.Author = author;
        this.category = category;
        this.total_quantity = total_quantity;
        this.availableQuantity = availableQuantity;
        this.Edition = edition;
        Status = status;
        this.dueDate = dueDate;
        this.borrowDate = borrowDate;
    }

    public String getUUID() {
        return UUID;
    }

    public void setUUID(String UUID) {
        this.UUID = UUID;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getTotal_quantity() {
        return total_quantity;
    }

    public void setTotal_quantity(int total_quantity) {
        this.total_quantity = total_quantity;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public String getEdition() {
        return Edition;
    }

    public void setEdition(String edition) {
       this.Edition = edition;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        this.Author = author;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(Date borrowDate) {
        this.borrowDate = borrowDate;
    }
}
