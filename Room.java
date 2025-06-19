import java.util.*;

public class Room {
    private int number;
    private boolean occupied;
    private List<Reservation> roomReservations = new ArrayList<>();

    public Room(int number) {
        this.number = number;
        this.occupied = false;
    }

    public void addReservation(Reservation reservation) {
        roomReservations.add(reservation);
        this.occupied = true;
    }

    public void deallocateRoom(Reservation reservation) {
        roomReservations.remove(reservation);
        if (roomReservations.isEmpty()) {
            this.occupied = false;
        }
    }
}