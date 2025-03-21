import skola.uni.display.SystemScreen;
import skola.uni.input.ReservationInput;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ReservationInput resIn = new ReservationInput();
        Scanner sc = new Scanner(System.in);

        String action;

        SystemScreen.displayReservationSystem();

        while (true) {
            SystemScreen.displayReservationOption();

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

