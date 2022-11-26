package my.id.adityaariizkyy.repository.impl;

import my.id.adityaariizkyy.domain.Author;
import my.id.adityaariizkyy.domain.Book;
import my.id.adityaariizkyy.repository.BookRepository;

import java.util.HashMap;
import java.util.Map;

public class BookRepositoryImpl implements BookRepository {

    // Dummy database
    private static Map <Long, Book>  bookMap;
    public BookRepositoryImpl(){
        bookMap = new HashMap();
        Author author1 = new Author();
        author1.setId(1);
        author1.setName("Aditya Rizky Ramadhan");
        author1.setAddress("Sidoarjo, Jawa Timur");
        Book book1 = new Book(author1);
        book1.setId(1L);
        book1.setTitle("Buku Dummy Satu");
        book1.setDescription("Ini buku dummy satu");
        Book book2 = new Book(author1);
        book2.setId(2L);
        book2.setTitle("Buku Dummy Dua");
        book2.setDescription("Ini buku dummy dua");
        bookMap.put(1L, book1);
        bookMap.put(2L, book2);
    }
    @Override
    public Book findById(long id) {
        return bookMap.get(id);
    }

    public int size(){
        return bookMap.size();
    }


}
