package fr.mdales.raymondelibrairy.domain;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A Book.
 */
@Entity
@Table(name = "book")
public class Book implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "resume")
    private String resume;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "isbn")
    private Integer isbn;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public Book title(String title) {
        this.title = title;
        return this;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getResume() {
        return resume;
    }

    public Integer getIsbn() {
        return isbn;
    }

    public Book setIsbn(Integer isbn) {
        this.isbn = isbn;
        return this;
    }

    public Book resume(String resume) {
        this.resume = resume;
        return this;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public Book imageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Book book = (Book) o;
        if (book.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), book.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Book{" +
            "id=" + getId() +
            ", title='" + getTitle() + "'" +
            ", resume='" + getResume() + "'" +
            ", imageUrl='" + getImageUrl() + "'" +
            "}";
    }
}
