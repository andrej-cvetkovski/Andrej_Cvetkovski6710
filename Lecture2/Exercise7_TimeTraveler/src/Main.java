import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input;

        while (true){
            System.out.println("Enter a year to see if its leap or not, or enter STOP to exit");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("Exit")) {
                System.out.println("Exiting the time traveler game");
                break;
            }

            try {
                int year = Integer.parseInt(input);
                if (isLeap(year)) {
                    System.out.println("Year is leap");
                } else {
                    System.out.println("Year is not leap");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, Enter a year to continue or EXIT to exit the program");
            }

        }
    }
    public static boolean isLeap(int year){
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;

        } else if (year % 400 == 0) {
            return true;

        } else return false;
    }
}
