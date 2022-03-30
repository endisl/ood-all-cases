package ood3_amazon_online_shopping_system;

import java.util.Date;
import java.util.List;

public class Shipment {
    private String shipmentNumber;
    private Date shipmentDate;
    private String shipmentMethod;
    private List<ShipmentLog> shipmentLogs;

    public boolean addShipmentLog(ShipmentLog shipmentLog) {
        //...
    }
}
