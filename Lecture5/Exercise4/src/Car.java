public class Car {
    private String model;
    private String color;
    private int numberOfDoors;

    public Car(String model, String color, int numberOfDoors) {
        this.model = model;
        this.color = color;
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public boolean equals(Object obj){
        if (obj == this) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        Car car = (Car) obj;
        return car.model.equals(this.model) && car.color.equals(this.color) && car.numberOfDoors == this.numberOfDoors;
    }

    @Override
    public String toString() {
        return "Car model: " + model + "{ " +numberOfDoors + ")";
    }
}
