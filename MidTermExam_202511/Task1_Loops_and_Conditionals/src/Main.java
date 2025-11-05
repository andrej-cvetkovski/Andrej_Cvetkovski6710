import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int n = scanner.nextInt();

        int sum = 0;

        if (n % 2 == 0) {
            for (int i = 2; i <= n; i += 2) {
                sum += i;
                System.out.print(i + " ");
            }
        } else {
            System.out.println("The number is not even");
            return;
        }
        System.out.print("The sum of even numbers up to " + n + " is " + sum);

        scanner.close();
    }
}
