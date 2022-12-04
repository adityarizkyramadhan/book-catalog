package my.id.adityaariizkyy.config;


import my.id.adityaariizkyy.domain.Author;
import my.id.adityaariizkyy.domain.Book;
import my.id.adityaariizkyy.repository.BookRepository;
import my.id.adityaariizkyy.repository.impl.BookRepositoryImpl;
import my.id.adityaariizkyy.service.BookService;
import my.id.adityaariizkyy.service.impl.BookServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@ComponentScan( basePackages = "my.id.adityaariizkyy")
@Configuration
public class AppConfig {

    @Bean
    public Author author(){
        return new Author(1L, "Aditya Rizky Ramadhan", "Sidoarjo, Jawa Timur");
    }

    @Bean
    public Book book1(Author author){
        Book temp = new Book(author);
        temp.setTitle("Bumi dan Api");
        temp.setId(1L);
        temp.setDescription("Ini deskripsi");
        return temp;
    }

    @Bean
    public Book book2(Author author){
        Book temp = new Book(author);
        temp.setTitle("Bumi dan Air");
        temp.setId(2L);
        temp.setDescription("Ini deskripsi");
        return temp;
    }

    @Bean
    public BookRepository bookRepository(Book book1, Book book2){
        Map<Long, Book> bookMap = new HashMap<>();
        bookMap.put(1L, book1);
        bookMap.put(2L, book2);
        BookRepositoryImpl bookRepository = new BookRepositoryImpl();
        bookRepository.setBookMap(bookMap);
        return  bookRepository;
    }

    @Bean
    public BookService bookService(BookRepository bookRepository){
        return new BookServiceImpl(bookRepository);
    }
}
