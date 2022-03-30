package ood3_amazon_online_shopping_system;

import java.util.Date;
import java.util.List;

public class Order {
    private String orderNumber;
    private OrderStatus status;
    private Date orderDate;
    private List<OrderLog> orderLogs;

    public boolean sendForShipment() {
        //...
    }

    public boolean makePayment(Payment payment) {
        //...
    }

    public boolean addOrderLog(OrderLog orderLog) {
        //...
    }
}
