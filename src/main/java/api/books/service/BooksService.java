package api.books.service;

import api.books.entity.BooksEntity;

import java.util.List;
import java.util.Optional;

public interface BooksService {
    List<BooksEntity> findAllBooks();
    Optional<BooksEntity> findById(Long id);
    BooksEntity saveBooks(BooksEntity booksEntity);
    BooksEntity updateBooks(Long id, BooksEntity booksEntity);

    void deleteBooks(Long id);

}