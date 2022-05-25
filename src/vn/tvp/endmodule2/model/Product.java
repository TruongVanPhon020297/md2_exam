package vn.tvp.endmodule2.model;

import java.time.Instant;

public class Product {
    private Long id;
    private String title;
    private Double price;
    private Integer quantity;
    private String description;

    public Product() {

    }

    public Product(long id, String title, double price, int quantity, String description) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
    }

    public static Product parse(String record) {
        String[] fields = record.split(",");
        long id = Long.parseLong(fields[0]);
        String title = fields[1];
        double price = Double.parseDouble(fields[2]);
        int quantity = Integer.parseInt(fields[3]);
        String description = fields[4];
        return new Product(id, title, price, quantity, description);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public String toString() {
        return String.format("%s,%s,%s,%s,%s,",
                id,
                title,
                price,
                quantity,
                description);
    }

}
