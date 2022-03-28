package ood3_amazon_online_shopping_system;

public abstract class Customer {
    private ShoppingCart cart;
    private Order order;

    public ShoppingCart getCart() {
        return cart;
    }

    public boolean addItem(Item item) {
        //...
    }

    public boolean removeItem(Item item) {
        //...
    }
}
