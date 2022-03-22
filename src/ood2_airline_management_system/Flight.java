package ood2_airline_management_system;

import java.util.List;

public class Flight {
    private String flightNumber;
    private Airport departure;
    private Airport arrival;
    private int durationInMinutes;

    private List<WeeklySchedule> weeklySchedules;
    private List<CustomSchedule> customSchedules;
    public List<FlightInstance> flightInstances() {
        //...
    }

    public boolean cancel() {
        //...
    }

    public boolean addFlightSchedule() {
        //...
    }
}
