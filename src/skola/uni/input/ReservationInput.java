package skola.uni.input;

import skola.uni.consts.ClassEnum;
import skola.uni.consts.ClassRoom;
import skola.uni.functions.Reservationfunctions;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class ReservationInput {
    Reservationfunctions reservationfunctions = new Reservationfunctions();

    public void createInput() {
        Scanner sc = new Scanner(System.in);

        String name;
        LocalDate startDate;
        LocalTime startTime;
        LocalDate endDate;
        LocalTime endTime;
        ClassEnum status;
        ClassRoom room;

        System.out.println("Enter the name of the reservation: ");
            name = sc.nextLine();
        System.out.println("Enter the start date of the reservation: ");
            startDate = LocalDate.parse(sc.nextLine());
        System.out.println("Enter the start time of the reservation: ");
            startTime = LocalTime.parse(sc.nextLine());
        System.out.println("Enter the end date of the reservation: ");
            endDate = LocalDate.parse(sc.nextLine());
        System.out.println("Enter the end time of the reservation: ");
            endTime = LocalTime.parse(sc.nextLine());
        System.out.println("Enter the status of the reservation: ");
            status = ClassEnum.valueOf(sc.nextLine());
        System.out.println("Enter the room of the reservation: ");
            room = ClassRoom.valueOf(sc.nextLine());
        System.out.println("----->");
            reservationfunctions.createReservation(name, startDate, startTime, endDate, endTime, status, room);
    }

    /*

    public void updateInput() {
        Scanner sc = new Scanner(System.in);
        Reservationfunctions reservationfunctions = new Reservationfunctions();

        String name;
        LocalDate startDate;
        LocalTime startTime;
        LocalDate endDate;
        LocalTime endTime;
        ClassEnum status;
        ClassRoom room;

        System.out.println("Enter the name of the reservation: ");
            name = sc.nextLine();
        System.out.println("Enter the start date of the reservation: ");
            startDate = LocalDate.parse(sc.nextLine());
        System.out.println("Enter the start time of the reservation: ");
            startTime = LocalTime.parse(sc.nextLine());
        System.out.println("Enter the end date of the reservation: ");
            endDate = LocalDate.parse(sc.nextLine());
        System.out.println("Enter the end time of the reservation: ");
            endTime = LocalTime.parse(sc.nextLine());
        System.out.println("Enter the status of the reservation: ");
            status = ClassEnum.valueOf(sc.nextLine());
        System.out.println("Enter the room of the reservation: ");
            room = ClassRoom.valueOf(sc.nextLine());
        System.out.println("----->");
            reservationfunctions.updateReservation(name, startDate, startTime, endDate, endTime, status, room);
    }

     */

    public void deleteInput() {
        Scanner sc = new Scanner(System.in);

        String name;

        System.out.println("Enter a reservation name: ");
            name = sc.nextLine();
        reservationfunctions.deleteReservation(name);
        System.out.println("Reservation "+ name +" successfully deleted");
    }

    public void printInput() {
        Scanner sc = new Scanner(System.in);

        String name;

        System.out.println("Enter a reservation name: ");
            name = sc.nextLine();
        reservationfunctions.printReservation(name);
    }

    public void printAllInput() {
        reservationfunctions.printReservations();
    }

}