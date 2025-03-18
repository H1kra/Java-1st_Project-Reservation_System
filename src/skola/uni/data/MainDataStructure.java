package skola.uni.data;
import skola.uni.object.Reservation;

import java.util.HashMap;
import java.util.Map;


public class MainDataStructure {
    private final Map<String, Reservation> reservations  = new HashMap<>();

    // Create a reservation using the person's name
    public void createReservation(String name, Reservation res) {
        reservations.put(name, res);
    }

    // Delete a reservation using the person's name
    public void deleteReservation(String name) {
        Reservation res = reservations.get(name);
        if (res != null) {
            reservations.remove(name);
        }
    }

    //Update a reservation
    /*
    public void updateReservation(String name, Reservation res) {
        Reservation old = reservations.get(name);
        if (old != null) {
            reservations.put(name, res);
        }
    }
    */

    // Get a reservations
    public void printReservations() {
        if (reservations.isEmpty()) {
            System.out.println("No reservations found.");
        } else {
            for (Map.Entry<String, Reservation> entry : reservations.entrySet()) {
                String name = entry.getKey();  // Reservation name
                Reservation reservation = entry.getValue();  // Reservation object
                System.out.println("------------------------------------------");
                System.out.println("Reservation for: " + name);
                System.out.println("Info: ");
                System.out.println("  Start D&T: " + reservation.getStartDate() + ", " + reservation.getStartTime());// This assumes you've implemented a meaningful toString() method in Reservation
                System.out.println("  End D&T: " + reservation.getEndDate() + ", " + reservation.getEndTime());
                System.out.println("  Status: " + reservation.getStatus());
                System.out.println("  Room: " + reservation.getRoom());
                System.out.println("------------------------------------------");
            }
        }
    }

    // Get a reservation using the person's name
    public void printReservation(String name) {
        if (reservations.isEmpty()) {
            System.out.println("No reservations found.");
        } else {
            Reservation reservation = reservations.get(name);
            if (reservation != null) {
                System.out.println("Reservation for: " + name);
                System.out.println("Info: ");
                System.out.println("  Start D&T: " + reservation.getStartDate() + ", " + reservation.getStartTime());
                System.out.println("  End D&T: " + reservation.getEndDate() + ", " + reservation.getEndTime());
                System.out.println("  Status: " + reservation.getStatus());
                System.out.println("  Room: " + reservation.getRoom());
                System.out.println("-------------------------------------------");
            } else {
                System.out.println("No reservations found.");
            }
        }
    }

}
