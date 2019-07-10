package com.techagi.microservice.librarysystem.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class Book {

    @Id
    private Long id;
    private String isbn;
    private String name;
    private String writerName;
    private BigDecimal price;

    public Book() {
    }

    public Book(Long id, String isbn, String name, String writerName, BigDecimal price) {
        this.id = id;
        this.isbn = isbn;
        this.name = name;
        this.writerName = writerName;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWriterName() {
        return writerName;
    }

    public void setWriterName(String writerName) {
        this.writerName = writerName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
