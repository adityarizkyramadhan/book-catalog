package my.id.adityaariizkyy.service.impl;

import my.id.adityaariizkyy.domain.Book;
import my.id.adityaariizkyy.dto.BookDetailDTO;
import my.id.adityaariizkyy.repository.BookRepository;
import my.id.adityaariizkyy.service.BookService;

public class BookServiceImpl implements BookService {

    private BookRepository bookRepository;

    public BookRepository getBookRepository() {
        return bookRepository;
    }

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public BookDetailDTO findById(long id) {
        Book book = bookRepository.findById(id);
        if (book == null){
            return null;
        }
        BookDetailDTO bookDetailDTO = new BookDetailDTO();
        bookDetailDTO.setIdBook(book.getId());
        bookDetailDTO.setAuthorName(book.getAuthor().getName());
        bookDetailDTO.setTitleBook(book.getTitle());
        bookDetailDTO.setDescriptionBook(book.getDescription());
        return bookDetailDTO;
    }

    public int size(){
        return bookRepository.size();
    }
}
