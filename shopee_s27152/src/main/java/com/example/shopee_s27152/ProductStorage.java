package com.example.shopee_s27152;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class ProductStorage {
    Map<String, Product> productMap;

    public ProductStorage() {
        this.productMap = new HashMap<>();
        this.addProduct(new Product(1,"mleko", 100));
    }

    public void addProduct(Product product){
        productMap.put(product.name, product);
    }

    public double priceCheck(List<String> productList){
        double totalPrice = 0;
        for (String product : productList){
            if (productMap.containsKey(product)) {
                totalPrice += productMap.get(product).price;
            }
        }
        return totalPrice;
    }



    @Override
    public String toString() {
        return "ProductStorage{" +
                "productMap=" + productMap +
                '}';
    }
}
