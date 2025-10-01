import java.util.Random;

public class Main {
    public static void main(String[] args) {


        Random random = new Random();
        int score = random.nextInt(101);

        String grade, message;
        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";

        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        switch (grade) {
            case "A":
                message = "Exelent job";
                break;

            case "B":
                message = "Very good job";
                break;

            case "C":
                message = "Good job";
                break;

            case "D":
                message = "Bad job";
                break;

            case "F":
                message = "Failed";
                break;

            default:
                message = "Unknown grade";
                break;
        }
        System.out.println("You've earned a " + grade + ", " + message);
    }
}