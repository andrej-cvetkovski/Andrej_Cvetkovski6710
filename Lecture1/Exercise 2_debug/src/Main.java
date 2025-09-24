public class Main {
    public static void main(String[] args) {

        int a = 2;
        int b = 5;
        int c = 10;

        int aTimesb = a * b;
        if (aTimesb < c) {
            System.out.println("Smaller");
        } else if (aTimesb > c) {
            System.out.println("Bigger");
        } else {
            System.out.println("Equal");
        }
    }
}