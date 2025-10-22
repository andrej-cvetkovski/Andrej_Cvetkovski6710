public class Vehicle {

    private String model;
    private int numberOfPass;
    private double gasTankCapacity;
    private double fuelConsumption;

    public Vehicle(String model, int numberOfPass, double gasTankCapacity, double fuelConsumption) {
        this.model = model;
        this.numberOfPass = numberOfPass;
        this.gasTankCapacity = gasTankCapacity;
        this.fuelConsumption = fuelConsumption;
    }

    public double howFar(){
        double fuelConsumptionPerKM = fuelConsumption / 100;
        return gasTankCapacity / fuelConsumptionPerKM;
    }

    public void compare(Vehicle other){
        double result1 = this.howFar();
        double result2 = other.howFar();
        if (result1 > result2) {
            System.out.println(model + " can go further than " + other.model);
        } else if (result2 > result1) {
            System.out.println(other.model + " can go further than " + model);

        } else {
            System.out.println("Both have same range");
        }
    }
}
