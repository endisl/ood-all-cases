package ood2_airline_management_system;

import java.time.LocalDateTime;

public class FlightInstance {
    private LocalDateTime departureTime;
    private String gate;
    private FlightStatus status;
    private Aircraft aircraft;

    public boolean cancel() {
        //...
    }

    public void updateStatus(FlightStatus status) {
        //...
    }
}
