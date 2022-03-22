package ood2_airline_management_system;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class FlightReservation {
    private String reservationNumber;
    private FlightInstance flight;
    private Map<Passenger, FlightSeat> seatMap;
    private LocalDate creationDate;
    private ReservationStatus status;

    public static FlightReservation fetchReservationDetails(String reservationNumber) {
        //...
    }

    public List<Passenger> getPassengers() {
        //...
    }
}
