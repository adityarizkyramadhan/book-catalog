package my.id.adityaariizkyy.dto;

import java.io.Serial;
import java.io.Serializable;

public class BookDetailDTO implements Serializable {

    private long idBook;

    private String authorName;

    private String titleBook;

    private String descriptionBook;

    @Serial
    private static final long serialVersionUID = -7618569693668954036L;

    public long getIdBook() {
        return idBook;
    }

    public void setIdBook(long idBook) {
        this.idBook = idBook;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getTitleBook() {
        return titleBook;
    }

    public void setTitleBook(String titleBook) {
        this.titleBook = titleBook;
    }

    public String getDescriptionBook() {
        return descriptionBook;
    }

    public void setDescriptionBook(String descriptionBook) {
        this.descriptionBook = descriptionBook;
    }


    @Override
    public String toString() {
        return "BookDetailDTO{" +
                "idBook=" + idBook +
                ", authorName='" + authorName + '\'' +
                ", titleBook='" + titleBook + '\'' +
                ", descriptionBook='" + descriptionBook + '\'' +
                '}';
    }
}
