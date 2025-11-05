public class ChocolateCookieWithExtras extends ChocolateCookie {
    private String extra;


    public ChocolateCookieWithExtras(double weight, String shape, double percentChocolate, String extra) {
        super(weight, shape, percentChocolate);
        this.extra = extra;
    }

    public ChocolateCookieWithExtras() {
        this.extra = "Hazelnuts";
    }

    @Override
    public void print () {
        super.print();
        System.out.println("Extras: " + extra);
    }

}









