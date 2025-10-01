import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temperature: ");

        int temperature = scanner.nextInt();

        switch (temperature) {
            case 30:
                System.out.println("Temperature is 30 degrees. It's sunny outside");
                break;

            case 20:
                System.out.println("Temperature is 20 degrees. It's Part cloudy outside");
                break;

            case 10:
                System.out.println("Temperature is 10 degrees. It's cold outside");
                break;

            case 0:
                System.out.println("Temperature is 0 degrees. It's snowing outside");
                break;

            default:
                if (temperature < 0) {
                    System.out.println("Temperature is below 0 degrees. It's dangerously cold outside");
                } else {
                    System.out.println("Temperature is: " + temperature);
                }
        }
    }
}