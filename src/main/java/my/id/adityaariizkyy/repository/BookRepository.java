package my.id.adityaariizkyy.repository;

import my.id.adityaariizkyy.domain.Book;

import java.util.Map;

public interface BookRepository {
    public Book findById(long id);
    public int size();
}
