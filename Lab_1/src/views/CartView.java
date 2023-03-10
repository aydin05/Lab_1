package views;

import services.CartService;
import models.Cart;
import models.Article;

import java.util.List;

public class CartView {
    private CartService cartService;

    public CartView(CartService cartService) {
        this.cartService = cartService;
    }

    public void displayAllCarts() {
        List<Cart> carts = cartService.getAllCarts();
        for (Cart cart : carts) {
            System.out.println("Cart ID: " + cart.getId());
            System.out.println("Created Date: " + cart.getCreatedDate());
            System.out.println("Updated Date: " + cart.getUpdatedDate());
            System.out.println("User ID: " + cart.getUserId());
            System.out.println("Articles:");
            List<Article> articles = cart.getArticles();
            for (Article article : articles) {
                System.out.println("- " + article.getName());
            }
        }
    }
}