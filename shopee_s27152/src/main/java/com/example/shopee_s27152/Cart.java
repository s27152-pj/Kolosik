package com.example.shopee_s27152;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    Customer customer;
    private List<String> productList;

    public Cart(Customer customer) {
        this.customer = customer;
        this.productList = new ArrayList<>();
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<String> getProductList() {
        return productList;
    }

    public void setProductList(List<String> productList) {
        this.productList = productList;
    }

    public void addCart(String item){
        productList.add(item);
    }
}
