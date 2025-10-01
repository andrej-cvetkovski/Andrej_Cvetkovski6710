import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name;

        System.out.println("Enter your agent name: ");
       name = scanner.nextLine();
        System.out.println("Agent's name: " + name);
        int lenght = name.length();
        System.out.println("Length of name is: " + lenght);
        char middleChar;

        if (lenght % 2 == 0) {
            middleChar = name.charAt(lenght/2 - 1);
        } else {
            middleChar = name.charAt(lenght / 2);
        }

        System.out.println("Middle character is: " + middleChar);

    }
}