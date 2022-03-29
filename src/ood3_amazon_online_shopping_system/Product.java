package ood3_amazon_online_shopping_system;

public class Product {
    private String productID;
    private String name;
    private String description;
    private double price;
    private ProductCategory category;
    private int availableItemCount;

    private Account seller;

    public int getAvailableItemCount(){
        //...
    }

    public boolean updatePrice(double newPrice) {
        //...
    }
}
