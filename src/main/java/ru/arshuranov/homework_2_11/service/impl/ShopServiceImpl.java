package ru.arshuranov.homework_2_11.service.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import ru.arshuranov.homework_2_11.service.ShopService;

import javax.websocket.Session;
import java.util.ArrayList;

@Service
@SessionScope
public class ShopServiceImpl implements ShopService {
private final ArrayList<Integer> cart = new ArrayList<>();

    @Override
    public void addProduct(int id) {
        cart.add(id);
    }

    @Override
    public ArrayList<Integer> getCart() {
        return cart;
    }
}
