import java.util.*;

public class Reservation {
    private int number;
    private Date reservationDate;
    private Date startDate;
    private Date endDate;
    private Room room;
    private ReserverPayer reserver;

    public Reservation(int number, Date reservationDate, Date startDate, Date endDate, Room room, ReserverPayer reserver) {
        this.number = number;
        this.reservationDate = reservationDate;
        this.startDate = startDate;
        this.endDate = endDate;
        this.room = room;
        this.reserver = reserver;
    }

    public int getNumber() {
        return number;
    }

    public Room getRoom() {
        return room;
    }

    public ReserverPayer getReserver() {
        return reserver;
    }
}