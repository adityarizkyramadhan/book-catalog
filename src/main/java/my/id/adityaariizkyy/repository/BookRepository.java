package my.id.adityaariizkyy.repository;

import my.id.adityaariizkyy.domain.Book;

public interface BookRepository {
    public Book findById(long id);
    public int size();
}
