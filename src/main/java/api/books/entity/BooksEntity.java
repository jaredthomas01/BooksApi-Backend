package api.books.entity;

import jakarta.persistence.*;

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

    @Column(name="pages")
    private String pages;

    @Column(name = "Quantity")
    private int quantity;

    @Column(name = "price")
   private double price;

    @Column(name = "Book_sold_on_credit")
    private String Sold_On_Credit;

    @Column(name = "Book_sold_on_debt")
    private String SoldOnDebt;

    @Column(name = "Books_Sold")
    private String BooksSold;

    public BooksEntity() {

    }

    public BooksEntity(Long id, String title, String author, String isbn, String publisher, String pages, int quantity,double price,String soldOnCredit, String soldOnDebt, String booksSold) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publisher = publisher;
        this.pages = pages;
        this.quantity = quantity;
        this.price = price;
        Sold_On_Credit = soldOnCredit;
        SoldOnDebt = soldOnDebt;
        BooksSold = booksSold;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBooksSold() {
        return BooksSold;
    }

    public void setBooksSold(String booksSold) {
        BooksSold = booksSold;
    }

    public String getSoldOnDebt() {
        return SoldOnDebt;
    }

    public void setSoldOnDebt(String soldOnDebt) {
        SoldOnDebt = soldOnDebt;
    }

    public String getSoldOnCredit() {
        return Sold_On_Credit;
    }

    public void setSoldOnCredit(String soldOnCredit) {
        Sold_On_Credit = soldOnCredit;
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
}
