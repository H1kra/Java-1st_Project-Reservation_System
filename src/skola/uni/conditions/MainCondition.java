package skola.uni.conditions;
import skola.uni.input.ReservationInput;


public class MainCondition {
    ReservationInput resIn = new ReservationInput();
    public void actionCondition(String action) {
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
            case "7":
            case "8":
            case "9":
                System.out.println("Work in progress. Try again later.");
                break;
            case "10":
                System.out.println("Exiting...");
                return;
            default:
                System.out.println("Invalid choice");
        }
    }
}