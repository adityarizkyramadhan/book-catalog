package my.id.adityaariizkyy.service;

import my.id.adityaariizkyy.dto.BookDetailDTO;

public interface BookService {
    public BookDetailDTO findById(long id);
    public int size();
}
