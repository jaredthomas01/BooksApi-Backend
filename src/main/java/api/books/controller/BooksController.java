package api.books.controller;

import api.books.entity.BooksEntity;
import api.books.service.BooksService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Books")
public class BooksController {

    private final BooksService booksService;

    public BooksController(BooksService booksService) {
        this.booksService = booksService;
    }

    @GetMapping
    public List<BooksEntity> findAllBooks() {
        return booksService.findAllBooks();
    }

    @GetMapping("/{id}")
    public Optional<BooksEntity> findBooksById(@PathVariable("id") Long id) {
        return booksService.findById(id);
    }

    @PostMapping
    public BooksEntity saveBooks(@RequestBody BooksEntity booksEntity) {
        return booksService.saveBooks(booksEntity);
    }

    @PutMapping("/{id}")
    public BooksEntity updateBooks(@PathVariable Long id, @RequestBody BooksEntity booksEntity) {
        return booksService.updateBooks(id, booksEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteBooks(@PathVariable("id") Long id) {
        booksService.deleteBooks(id);
    }

    @GetMapping("/{new-arrivals}")
    public List<BooksEntity> getNewArrivals(@PathVariable("new-arrivals") String parameter) {
        return booksService.findNewArrivals();
    }

    @GetMapping("/{featured}")
    public List<BooksEntity> getFeatured(@PathVariable String featured) {
        return booksService.findFeatured();
    }

}
