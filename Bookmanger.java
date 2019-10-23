package com.inherit;

public class Bookmanger {
    public static void main(String[] arge){
        //Dictionary dictionary = new Dictionary();
        //dictionary.getBushouPages();
        Book book = new Book("hpf","123","100");
        Dictionary dictionary = new Dictionary("hpf","123","100",100);
        System.out.println(book.toString());
        System.out.println(dictionary.toString());
        System.out.println(book.getBookid());
        System.out.println(dictionary.getBookid());
    }
}
