package com.inherit;

public class Book {
    private String bookname;
    private String bookid;
    protected String pages;

    public Book(String bookname, String bookid, String pages) {
        this.bookname = bookname;
        this.bookid = bookid;
        this.pages = pages;
    }

    public String getBookid() {
        return bookid;
    }

    public String getPages() {
        return pages;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public void setBookid(String bookid) {
        this.bookid = bookid;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "bookname=" + bookname + ", bookid=" + bookid  + ", pages=" + pages;
    }
}
