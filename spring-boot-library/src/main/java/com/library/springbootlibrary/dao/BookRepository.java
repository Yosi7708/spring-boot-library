package com.library.springbootlibrary.dao;
import com.library.springbootlibrary.entity.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestParam;

public interface BookRepository extends JpaRepository<Book, Long>{
    //now we can use this method to search for books by title and we can page the results
    Page<Book> findByTitleContaining(@RequestParam("title") String title, Pageable pageable);
}
