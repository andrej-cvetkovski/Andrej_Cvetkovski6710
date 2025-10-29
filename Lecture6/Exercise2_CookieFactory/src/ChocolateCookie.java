public class ChocolateCookie extends Cookie {
    private double percentChocolate;

    public ChocolateCookie(double weight, String shape, double percentChocolate) {
        super(weight, shape);
        this.percentChocolate = percentChocolate;
    }

    public ChocolateCookie() {
        super();
        this.percentChocolate = 50.2;
    }

    @Override
    public void print () {
        super.print();
        System.out.println("Percentage Chocolate: " + percentChocolate);
    }
}
