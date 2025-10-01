import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int score = random.nextInt(100);
        System.out.println("Generated number : " + score);

        if (score >= 60) {
            System.out.println("You have passed the exam!");
        } else {
            System.out.println("You have failed! Better luck next year.");
        }
    }
}