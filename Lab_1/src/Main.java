import models.Cart;
import models.Article;

import repositories.CartRepository;
import services.CartService;
import views.CartView;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Article> articles1 = new ArrayList<>();
        articles1.add(new Article());
        articles1.add(new Article());
        List<Article> articles2 = new ArrayList<>();
        articles2.add(new Article());
        articles2.add(new Article());
        List<Cart> carts = new ArrayList<>();
        carts.add(new Cart());
        carts.add(new Cart());
        CartRepository cartRepository = new CartRepository(carts);
        CartService cartService = new CartService(cartRepository);
        CartView cartView = new CartView(cartService);

        cartView.displayAllCarts();
    }
}