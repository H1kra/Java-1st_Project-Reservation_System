import skola.uni.input.ReservationInput;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ReservationInput resIn = new ReservationInput();
        Scanner sc = new Scanner(System.in);

        String action;

        System.out.println("|-------- Reservation  System --------|");
        System.out.println("|                                     |");
        System.out.println("| 1. Create Reservation    6. ------- |");
        System.out.println("| 2. Delete Reservation    7. ------- |");
        System.out.println("| 3. Update Reservation    8. ------- |");
        System.out.println("| 4. Print Reservation     9. ------- |");
        System.out.println("| 5. Print Reservations    10. Exit   |");
        System.out.println("|                                     |");

        while (true) {
            System.out.println("|-------------------------------------|");
            System.out.println("|  Enter your choice:                 |");
            System.out.println("|-------------------------------------|");

            action = sc.nextLine();

            if ("1".equalsIgnoreCase(action)) {
                resIn.createInput();
            }
            else if ("2".equalsIgnoreCase(action)) {
            //    resIn.updateInput();
                System.out.println("Work in progress. Try again later.");

            }
            else if ("3".equalsIgnoreCase(action)) {
                resIn.deleteInput();
            }
            else if ("4".equalsIgnoreCase(action)) {
                resIn.printInput();
            }
            else if ("5".equalsIgnoreCase(action)) {
                resIn.printAllInput();
            }
            else if ("6".equalsIgnoreCase(action)) {
                System.out.println("Work in progress. Try again later.");
            }
            else if ("7".equalsIgnoreCase(action)) {
                System.out.println("Work in progress. Try again later.");
            }
            else if ("8".equalsIgnoreCase(action)) {
                System.out.println("Work in progress. Try again later.");
            }
            else if ("9".equalsIgnoreCase(action)) {
                System.out.println("Work in progress. Try again later.");
            }
            else if ("10".equalsIgnoreCase(action)) {
                System.out.println("Exiting...");
                break;
            }
            else {
                System.out.println("Invalid choice");
            }
        }
        sc.close();
    }
}
//------------------------------------------------------------------------------------------------------------------------

