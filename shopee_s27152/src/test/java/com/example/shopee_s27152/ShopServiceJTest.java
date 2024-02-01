package com.example.shopee_s27152;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ShopServiceJTest {
    @Mock
    private ProductStorage productStorage;
    @InjectMocks
    private ShopService shopService;

    @Test
    void test(){
        List<String> lista = new ArrayList<>();
        lista.add("mleko");

        when(productStorage.priceCheck(lista))
                .thenReturn(200d);
        Customer customer = new Customer(1, 150);
        Cart cart = new Cart(customer);
        cart.addCart("mleko");
        assertThat(shopService.buyProduct(cart)).isEqualTo("Biedak :c");

    }
}
