package ood1_hotel_management_system;

public class RoomBooking {
    private String reservationNumber;
    private Date startDate;
    private int durationDays;
    private BookingStatus status;
    private Date checkIn;
    private Date checkOut;

    private int guestID;
    private Room room;
    private Invoice invoice;
    private List<Notification> notifications;

    public static RoomBooking fetchDetails(String reservationNumber);
}