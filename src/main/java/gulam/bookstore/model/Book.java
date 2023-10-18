package gulam.bookstore.model;

import lombok.Data;

@Data
public class Book {

    private String name;
    private String author;
    private double price;
    private String barcode;
    private int discount;
    private String genre;
    private int quantity;
}
