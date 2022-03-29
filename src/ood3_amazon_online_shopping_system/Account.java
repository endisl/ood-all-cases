package ood3_amazon_online_shopping_system;

import java.util.List;

public class Account {
    private String userName;
    private String password;
    private AccountStatus status;
    private String name;
    private Address shippingAddress;
    private String email;
    private String phone;

    private List<CreditCard> creditCards;
    private List<ElectronicBankTransfer> bankAccounts;

    public boolean addProduct(Product product) {
        //...
    }

    public boolean addProductReview(ProductReview review) {
        //...
    }

    public boolean resetPassword() {
        //...
    }


}
