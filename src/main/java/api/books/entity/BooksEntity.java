package api.books.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "Books")
public class BooksEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Book_id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "Author")
    private String author;

    @Column(name = "isbn")
    private String isbn;

    @Column(name = "publisher")
    private String publisher;

    @Column(name = "pages")
    private String pages;

    @Column(name = "Quantity")
    private int quantity;

    @Column(name = "price")
    private double price;

    @Column(name = "Book_sold_on_credit")
    private String soldOnCredit;

    @Column(name = "Book_sold_on_debt")
    private String soldOnDebt;

    @Column(name = "Books_Sold")
    private String booksSold;

    @Lob
    @Column(name = "image")
    private String image;

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    public BooksEntity() {}

    public BooksEntity(Long id, String title, String author, String isbn, String publisher, String pages, int quantity, double price, String soldOnCredit, String soldOnDebt, String booksSold, String image, LocalDateTime createdAt) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publisher = publisher;
        this.pages = pages;
        this.quantity = quantity;
        this.price = price;
        this.soldOnCredit = soldOnCredit;
        this.soldOnDebt = soldOnDebt;
        this.booksSold = booksSold;
        this.image = image;
        this.createdAt = LocalDateTime.now();
    }

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBooksSold() {
        return booksSold;
    }

    public void setBooksSold(String booksSold) {
        this.booksSold = booksSold;
    }

    public String getSoldOnDebt() {
        return soldOnDebt;
    }

    public void setSoldOnDebt(String soldOnDebt) {
        this.soldOnDebt = soldOnDebt;
    }

    public String getSoldOnCredit() {
        return soldOnCredit;
    }

    public void setSoldOnCredit(String soldOnCredit) {
        this.soldOnCredit = soldOnCredit;
    }

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
