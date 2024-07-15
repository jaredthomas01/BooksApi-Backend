package api.books.repository;

import api.books.entity.BooksEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface BooksRepository extends JpaRepository<BooksEntity, Long> {

    @Query(value = "SELECT * FROM Books ORDER BY created_at DESC LIMIT 5", nativeQuery = true)
    List<BooksEntity> findTop5ByOrderByCreatedAtDesc();

    @Query(value = "SELECT * FROM Books ORDER BY created_at DESC LIMIT 10", nativeQuery = true)
    List<BooksEntity> findTop10ByOrderByCreatedAtDesc();
}
