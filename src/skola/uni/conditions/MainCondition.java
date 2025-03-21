package skola.uni.conditions;
import skola.uni.display.SystemScreen;
import skola.uni.input.ReservationInput;

import java.util.Scanner;


public class MainCondition {
    Scanner sc = new Scanner(System.in);
    ReservationInput resIn = new ReservationInput();
    String action;
    public void actionCondition() {
        boolean DOLOOP = true;
        while (DOLOOP) {
            SystemScreen.displayReservationOption();
            action = sc.nextLine();
            switch (action) {
                case "1":
                    resIn.createInput();
                    break;
                case "2":
                    System.out.println("Work in progress. Try again later.");
                    break;
                case "3":
                    resIn.deleteInput();
                    break;
                case "4":
                    resIn.printInput();
                    break;
                case "5":
                    resIn.printAllInput();
                    break;
                case "6":
                    System.out.println("Work in progress. Try again later.");
                    break;
                case "7":
                    System.out.println("Work in progress. Try again later.");
                    break;
                case "8":
                    System.out.println("Work in progress. Try again later.");
                    break;
                case "9":
                    System.out.println("Work in progress. Try again later.");
                    break;
                case "10":
                    System.out.println("Exiting...");
                    DOLOOP = false;
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
        sc.close();
    }
}