package com.example.shopee_s27152;

import org.springframework.stereotype.Service;

@Service
public class ShopService {
    private ProductStorage productStorage;

    public String buyProduct(Cart cart){
        double cartPrice = productStorage.priceCheck(cart.getProductList());
        if (!cart.getCustomer().canBuy(cartPrice)) {
            return "Biedak :c";
        }
        cart.getCustomer().mniejKasy(cartPrice);
        return "Bogol C:";
    }

    public ShopService(ProductStorage productStorage) {
        this.productStorage = productStorage;
    }
}
