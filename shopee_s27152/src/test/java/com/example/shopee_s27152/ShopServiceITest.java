package com.example.shopee_s27152;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ShopServiceITest {

    @Autowired
    private ShopService shopService;

    @Test
    void buyProduct() {
        Customer customer = new Customer(1, 350);
        Cart cart = new Cart(customer);
        cart.addCart("mleko");
        cart.addCart("mleko");
        cart.addCart("piwo");
        assertThat(shopService.buyProduct(cart)).isEqualTo("Bogol C:");
    }

    @Test
    void buyProduct1() {
        Customer customer = new Customer(1, 150);
        Cart cart = new Cart(customer);
        cart.addCart("mleko");
        cart.addCart("mleko");
        cart.addCart("piwo");
        assertThat(shopService.buyProduct(cart)).isEqualTo("Biedak :c");
    }
}