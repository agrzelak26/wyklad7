package shop;

import java.math.BigDecimal;

public class Product {
    protected String name;
    protected BigDecimal price;

    public Product(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }
}
