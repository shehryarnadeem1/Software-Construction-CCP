import java.util.*;

public class GuestHouseChain {
    private String name;
    private List<GuestHouse> guestHouses = new ArrayList<>();

    public GuestHouseChain(String name) {
        this.name = name;
    }

    public void addGuestHouse(GuestHouse guestHouse) {
        guestHouses.add(guestHouse);
    }

    public String makeReservation(String guestHouseName, Date startDate, Date endDate,
                                   String roomType, String reserverName, String address, String creditCardNo) {
        return "Confirmed: Reservation made at " + guestHouseName;
    }

    public String cancelReservation(int reservationNumber) {
        for (GuestHouse guestHouse : guestHouses) {
            String result = guestHouse.cancelReservation(reservationNumber);
            if (!result.contains("Error")) return result;
        }
        return "Error: Reservation not found in any GuestHouse.";
    }
}