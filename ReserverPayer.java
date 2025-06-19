import java.util.*;

public class ReserverPayer {
    private Map<Integer, Reservation> myReservations = new HashMap<>();

    public void addReservation(Reservation reservation) {
        myReservations.put(reservation.getNumber(), reservation);
    }

    public void removeReservation(int reservationNumber) {
        if (!myReservations.containsKey(reservationNumber)) {
            throw new IllegalArgumentException("Invalid reservation number.");
        }
        myReservations.remove(reservationNumber);
    }
}