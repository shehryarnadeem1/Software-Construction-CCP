import java.util.*;

public class GuestHouse {
    private String name;
    private Map<Integer, Reservation> reservations = new HashMap<>();

    public GuestHouse(String name) {
        this.name = name;
    }

    public void addReservation(Reservation reservation) {
        reservations.put(reservation.getNumber(), reservation);
    }

    public String cancelReservation(int reservationNumber) {
        if (!reservations.containsKey(reservationNumber)) {
            return "Error: Reservation number does not exist.";
        }

        Reservation reservation = reservations.get(reservationNumber);
        reservations.remove(reservationNumber);

        reservation.getReserver().removeReservation(reservationNumber);
        reservation.getRoom().deallocateRoom(reservation);

        return "Reservation #" + reservationNumber + " has been successfully cancelled.";
    }
}