package com.inherit;

public class Dictionary extends Book {

    private int bushouPages;

    public Dictionary(String bookname, String bookid, String pages, int bushouPages) {
        super(bookname, bookid, pages);
        this.bushouPages = bushouPages;
    }

    public int getBushouPages() {
        return bushouPages;
    }

    public void setBushouPages(int bushouPages) {
        this.bushouPages = bushouPages;
    }

    @Override
    public String getBookid() {
        return super.getBookid() + "abc";
    }

    public String toString() {
        return super.toString()+",bushouPages=" + bushouPages;
    }
}
