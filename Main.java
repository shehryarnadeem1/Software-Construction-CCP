import java.util.*;

public class Main {
    public static void main(String[] args) {
        Room room = new Room(101);
        ReserverPayer reserver = new ReserverPayer();
        Date now = new Date();
        Reservation reservation = new Reservation(1, now, now, now, room, reserver);

        room.addReservation(reservation);
        reserver.addReservation(reservation);

        GuestHouse guestHouse = new GuestHouse("Royal Inn");
        guestHouse.addReservation(reservation);

        GuestHouseChain chain = new GuestHouseChain("Elite Hotels");
        chain.addGuestHouse(guestHouse);

        System.out.println(chain.cancelReservation(1)); // Success
        System.out.println(chain.cancelReservation(1)); // Error
    }
}