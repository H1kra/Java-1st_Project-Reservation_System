package skola.uni.functions;
import skola.uni.consts.ClassEnum;
import skola.uni.consts.ClassRoom;
import skola.uni.object.Reservation;
import skola.uni.data.MainDataStructure;

import java.time.LocalDate;
import java.time.LocalTime;

public class Reservationfunctions {
    private final MainDataStructure mainDataStructure = new MainDataStructure();


    public void createReservation(String name, LocalDate startDate, LocalTime startTime, LocalDate endDate, LocalTime endTime, ClassEnum status, ClassRoom room) {
        Reservation res = new Reservation(name, startDate, startTime, endDate, endTime, status, room);
        mainDataStructure.createReservation(name, res);
    }

    public void printReservations() {
        mainDataStructure.printReservations();
    }

    public void deleteReservation(String name) {
        mainDataStructure.deleteReservation(name);
    }

    public void printReservation(String name) {
        mainDataStructure.printReservation(name);
    }


    /*
    public void updateReservation(String newName, LocalDate newStartDate, LocalTime newStartTime, LocalDate newEndDate, LocalTime newEndTime, ClassEnum newStatus, ClassRoom newRoom) {

        if (!"skip".equalsIgnoreCase(newName)){

        }
        if (!"skip".equals(newStartDate)){
            System.out.println(" ");
        }
        if (!"skip".equals(newStartTime)){
            System.out.println(" ");
        }
        if (!"skip".equals(newEndDate)){
            System.out.println(" ");
        }
        if (!"skip".equals(newEndTime)){
            System.out.println(" ");
        }
        if (!"skip".equals(newStatus)){
            System.out.println(" ");
        }
        if (!"skip".equals(newRoom)){
            System.out.println(" ");
        }


        Reservation res = new Reservation(newName, newStartDate, newStartTime, newEndDate, newEndTime, newStatus, newRoom);
        mainDataStructure.updateReservation(newName, res);
    }
    */

    /*
    public void changeReservation() {};
     */
}
