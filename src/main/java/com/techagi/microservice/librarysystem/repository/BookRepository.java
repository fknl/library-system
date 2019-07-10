package com.techagi.microservice.librarysystem.repository;

import com.techagi.microservice.librarysystem.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, String> {

}
