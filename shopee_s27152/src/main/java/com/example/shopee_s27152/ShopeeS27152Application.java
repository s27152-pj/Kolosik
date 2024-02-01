package com.example.shopee_s27152;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class ShopeeS27152Application implements CommandLineRunner
{
	private final ShopService shopService;

	@Autowired
	public ShopeeS27152Application(ShopService shopService) {
		this.shopService = shopService;
	}

	public static void main(String[] args) {
		SpringApplication.run(ShopeeS27152Application.class, args);
	}
	@Override
	public void run(String... args){
		Customer customer = new Customer(1, 200);
		Cart cart = new Cart(customer);
		cart.addCart("mleko");
		cart.addCart("mleko");
		cart.addCart("piwo");
		System.out.println(shopService.buyProduct(cart));
	}
}
