package ru.arshuranov.homework_2_11.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.arshuranov.homework_2_11.service.ShopService;

import java.util.ArrayList;

@RequestMapping(path = "/store/order")

@RestController
public class ShoppingCartController {
    private final ShopService shopService;

    public ShoppingCartController(ShopService shopService) {
        this.shopService = shopService;
    }

    @GetMapping("/add")
    public void addProduct(@RequestParam("id") int productId) {
        shopService.addProduct(productId);
    }

    @GetMapping("/get")
    public ArrayList<Integer> getCart() {
        return shopService.getCart();
    }
}
