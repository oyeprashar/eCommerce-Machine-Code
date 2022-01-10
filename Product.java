package main.java.com.company.entities;

public class Product {

    public String name;
    public long productId;
    public String desc;
    public double price;

    public Product(String name, long productId, String desc, double price){
        this.name = name;
        this.productId = productId;
        this.desc = desc;
        this.price = price;
    }
}
