package ood1_hotel_management_system;

public class Room implements Search {
    private String roomNumber;
    private RoomStyle style;
    private RoomStatus status;
    private double bookingPrice;
    private boolean isSmoking;

    private List<RoomKey> keys;
    private List<RoomHouseKeeping> houseKeepingLog;

    public boolean isRoomAvailable();
    public boolean checkIn();
    public boolean checkOut();

    public static List<Room> search(RoomStyle, Date startDate, int duration) {
        // return all rooms with the given style and availability
    }
}