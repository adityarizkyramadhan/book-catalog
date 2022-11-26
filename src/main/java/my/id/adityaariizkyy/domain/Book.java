package my.id.adityaariizkyy.domain;

import java.io.Serial;
import java.io.Serializable;

public class Book implements Serializable {

    public Book(Author author) {
        this.author = author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Serial
    private static final long serialVersionUID;

    static {
        serialVersionUID = -8542020971557798182L;
    }

    private Author author;


    public Author getAuthor() {
        return author;
    }

    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    private String title;

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String description;


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



}
