package org.example;

import org.example.Iterator.Book;
import org.example.Iterator.BookShelf;
import org.example.Iterator.BookShelfIterator;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("디자인 패턴"));
        bookShelf.appendBook(new Book("JPA 프로그래밍"));
        bookShelf.appendBook(new Book("리눅스 마스터"));
        bookShelf.appendBook(new Book("정보처리기사"));

        //BookShelfIterator iterator = new BookShelfIterator(bookShelf);
        Iterator<Book> it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = it.next();
            System.out.println(book.getName());
        }
        System.out.println();

        for(Book book : bookShelf) {
            System.out.println(book.getName());
        }
        System.out.println();
    }
}