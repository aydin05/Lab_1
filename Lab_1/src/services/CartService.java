package services;

import models.Cart;
import repositories.CartRepository;

import java.util.List;

public class CartService {
    private CartRepository cartRepository;

    public CartService(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    public List<Cart> getAllCarts() {
        return cartRepository.getAllCarts();
    }
}