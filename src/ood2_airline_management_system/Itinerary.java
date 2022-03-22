package ood2_airline_management_system;

import java.time.LocalDate;
import java.util.List;

public class Itinerary {
    private String customerId;
    private Airport startingAirport;
    private Airport finalAirport;
    private LocalDate creationDate;

    public List<FlightReservation> getReservations() {
        //...
    }

    public boolean makeReservation() {
        //...
    }

    public boolean makePayment() {
        //...
    }
}
