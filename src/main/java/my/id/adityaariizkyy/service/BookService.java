package my.id.adityaariizkyy.service;

import my.id.adityaariizkyy.dto.BookDetailDTO;

public interface BookService {
    BookDetailDTO findById(long id);
    int size();
}
