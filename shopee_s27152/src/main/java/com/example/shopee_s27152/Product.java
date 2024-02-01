package com.example.shopee_s27152;

public class Product {
    int ProductID;
    String name;
    double price;

    public Product(int productID, String name, double price) {
        ProductID = productID;
        this.name = name;
        this.price = price;
    }

    public int getProductID() {
        return ProductID;
    }

    public void setProductID(int productID) {
        ProductID = productID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "ProductID=" + ProductID +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
