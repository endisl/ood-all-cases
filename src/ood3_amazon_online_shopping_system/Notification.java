package ood3_amazon_online_shopping_system;

import java.util.Date;

public abstract class Notification {
    private int notificationID;
    private Date creationDate;
    private String content;

    public boolean sendNotification(Account account) {
        //...
    }
}
