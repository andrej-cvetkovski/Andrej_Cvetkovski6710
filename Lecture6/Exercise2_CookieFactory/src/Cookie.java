
public class Cookie {
    private double weight;
    private  String shape;

    public Cookie(double weight, String shape) {
        this.weight = weight;
        this.shape = shape;
    }

    public Cookie() {
        this.shape = " Round";
        this.weight = 20.1;
    }

    public void print () {
        System.out.println("Cookie details:");
        System.out.println("Shape" + shape);
        System.out.println("Weight" + weight);
    }
}
