package org.example.Iterator;

import java.util.Iterator;

public class BookShelfIterator implements Iterator<Book> {

    private BookShelf bookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }





    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Book next() {
        return null;
    }
}
