package my.id.adityaariizkyy.repository.impl;

import my.id.adityaariizkyy.domain.Author;
import my.id.adityaariizkyy.domain.Book;
import my.id.adityaariizkyy.repository.BookRepository;

import java.util.HashMap;
import java.util.Map;

public class BookRepositoryImpl implements BookRepository {

    public Map<Long, Book> getBookMap() {
        return bookMap;
    }

    public void setBookMap(Map<Long, Book> bookMap) {
        this.bookMap = bookMap;
    }

    // Dummy database
    private Map <Long, Book>  bookMap;
    public BookRepositoryImpl(){}
    @Override
    public Book findById(long id) {
        return bookMap.get(id);
    }

    public int size(){
        return bookMap.size();
    }


}
