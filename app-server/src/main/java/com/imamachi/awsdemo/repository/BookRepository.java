package com.imamachi.awsdemo.repository;

import com.imamachi.awsdemo.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

// collectionResourceRel: JSON内のキー名
// path: URLに使われるパス名
@RepositoryRestResource(collectionResourceRel = "books", path = "items")
public interface BookRepository extends JpaRepository<Book, Integer> {

}
