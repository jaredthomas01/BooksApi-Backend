package api.books.service.impl;

import api.books.entity.BooksEntity;
import api.books.repository.BooksRepository;
import api.books.service.BooksService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class BooksServiceImpl implements BooksService {

    private final BooksRepository booksRepository;

    public BooksServiceImpl(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    @Override
    public List<BooksEntity> findAllBooks() {
        return booksRepository.findAll();
    }

    @Override
    public Optional<BooksEntity> findById(Long id) {
        return booksRepository.findById(id);
    }

    @Override
    public BooksEntity saveBooks(BooksEntity booksEntity) {
        return booksRepository.save(booksEntity);
    }

    @Override
    public BooksEntity updateBooks(BooksEntity booksEntity) {
        return booksRepository.save(booksEntity);
    }

    @Override
    public void deleteBooks(Long id) {
        booksRepository.deleteById(id);
    }

}
