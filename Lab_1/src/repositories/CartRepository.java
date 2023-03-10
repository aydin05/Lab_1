package repositories;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import models.Cart;
import models.Article;

public class CartRepository {
    private List<Cart> carts;

    public CartRepository(List<Cart> carts) {
        this.carts = new ArrayList<Cart>();

        // Mock data
        Cart cart1 = new Cart();
        cart1.setId(1);
        cart1.setCreatedDate(new Date());
        cart1.setUpdatedDate(new Date());
        cart1.setUserId(123);
        List<Article> articles1 = new ArrayList<Article>();
        Article article1 = new Article();
        article1.setId(1);
        article1.setName("Article 1");
        article1.setPrice(10.0);
        article1.setQuantity(2);
        article1.setUnit("pcs");
        articles1.add(article1);
        Article article2 = new Article();
        article2.setId(2);
        article2.setName("Article 2");
        article2.setPrice(5.0);
        article2.setQuantity(5);
        article2.setUnit("pcs");
        articles1.add(article2);
        cart1.setArticles(articles1);
        cart1.setValue(40.0);
        this.carts.add(cart1);

        Cart cart2 = new Cart();
        cart2.setId(2);
        cart2.setCreatedDate(new Date());
        cart2.setUpdatedDate(new Date());
        cart2.setUserId(456);
        List<Article> articles2 = new ArrayList<Article>();
        Article article3 = new Article();
        article3.setId(3);
        article3.setName("Article 3");
        article3.setPrice(2.0);
        article3.setQuantity(10);
        article3.setUnit("pcs");
        articles2.add(article3);
        cart2.setArticles(articles2);
        cart2.setValue(20.0);
        this.carts.add(cart2);
    }

    public Cart getCart(int id) {
        for (Cart cart : carts) {
            if (cart.getId() == id) {
                return cart;
            }
        }
        return null;
    }

    public List<Cart> getAllCartsWithUpdateDate(Date updateDate) {
        List<Cart> filteredCarts = new ArrayList<Cart>();
        for (Cart cart : carts) {
            if (cart.getUpdatedDate().after(updateDate)) {
                filteredCarts.add(cart);
            }
        }
        return filteredCarts;
    }

    public List<Cart> getAllCarts() {
        return carts;
    }
}