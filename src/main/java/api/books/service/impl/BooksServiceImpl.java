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
    public BooksEntity updateBooks(Long id, BooksEntity booksEntity) {
        Optional<BooksEntity> existingBookOpt = booksRepository.findById(id);

        if (existingBookOpt.isPresent()) {
            BooksEntity existingBook = existingBookOpt.get();
            existingBook.setTitle(booksEntity.getTitle());
            existingBook.setAuthor(booksEntity.getAuthor());
            existingBook.setIsbn(booksEntity.getIsbn());
            existingBook.setPublisher(booksEntity.getPublisher());
            existingBook.setPages(booksEntity.getPages());
            existingBook.setQuantity(booksEntity.getQuantity());
            existingBook.setPrice(booksEntity.getPrice());
            existingBook.setImage(booksEntity.getImage());
            return booksRepository.save(existingBook);
        } else {
            throw new ResourceNotFoundException("Book not found with ID: " + id);
        }
    }


    @Override
    public void deleteBooks(Long id) {
        booksRepository.deleteById(id);
    }

    @Override
    public List<BooksEntity> findNewArrivals() {
        return booksRepository.findTop5ByOrderByCreatedAtDesc();
    }

    @Override
    public List<BooksEntity> findFeatured() {
        return booksRepository.findTop10ByOrderByCreatedAtDesc();
    }

}
