# Question 1 – Cancel Reservation Method (Software Construction CCP)

## 📌 Problem Statement

Implement the `cancelReservation(int reservationNumber)` method in the `GuestHouse` class that performs the following:

- ✅ Removes the reservation from the guest house's reservation list.
- ✅ Removes it from the associated `ReserverPayer`.
- ✅ Deallocates the room assigned to the reservation.
- ✅ Applies **defensive programming** to handle invalid inputs.
- ✅ Uses **clean code** practices and **object-oriented principles**.

---

## 🧠 Object-Oriented Design Summary

This project uses multiple related classes to simulate a real-world guest house reservation system:

### 🔹 Classes and Relationships

| Class            | Responsibility                                         |
|------------------|--------------------------------------------------------|
| `GuestHouse`     | Manages reservations, handles cancellation             |
| `Reservation`    | Holds reservation data (room, reserver, dates)         |
| `Room`           | Manages reservation allocation and deallocation        |
| `ReserverPayer`  | Stores a user's reservations in a `HashMap`            |
| `Guest`          | Represents a guest (name, address)                     |
| `RoomType`       | Describes the type and cost of room                    |
| `GuestHouseChain`| Chain managing multiple guest houses                   |

---

## 🧩 Key Method: `cancelReservation(int)`

### 📄 Defined in `GuestHouse.java`

```java
public String cancelReservation(int reservationNumber) {
    if (!reservations.containsKey(reservationNumber)) {
        return "Error: Reservation number does not exist.";
    }

    Reservation reservation = reservations.get(reservationNumber);
    reservations.remove(reservationNumber);

    reservation.getReserver().removeReservation(reservationNumber);
    reservation.getRoom().deallocateRoom(reservation);

    return "Reservation #" + reservationNumber + " has been successfully cancelled.";

}💻 How to Compile and Run

📁 File Structure:

Ensure all the following .java files are in the Qno1 folder:
Qno1/
├── Guest.java
├── GuestHouse.java
├── GuestHouseChain.java
├── Reservation.java
├── ReserverPayer.java
├── Room.java
├── RoomType.java
├── Main.java
└── README.md

🖥️ Compile:
cd ~/Desktop/CCPJava/Qno1
javac *.java

▶️ Run:
java Main

🧪 Example Output:
Reservation #1 has been successfully cancelled.
Error: Reservation not found in any GuestHouse.