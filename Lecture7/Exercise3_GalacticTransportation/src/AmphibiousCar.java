public class AmphibiousCar implements Vehicle, GroudTransport {

    private double fuelCapacity;
    private int passangerCapacity;
    private String terrainType;

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public int getPassangerCapacity() {
        return passangerCapacity;
    }

    public void setPassangerCapacity(int passangerCapacity) {
        this.passangerCapacity = passangerCapacity;
    }

    public void setTerrainType(String terrainType) {
        this.terrainType = terrainType;
    }

    @Override
    public double getFuelCapacity(){
        return fuelCapacity;
    }

    @Override
    public int getPassengerCapacity(){
        return passangerCapacity;

    }

    @Override
    public void driver(){
        System.out.println("Amphibious car is driving on " + terrainType);

    }
    @Override
    public String getTerrainType(){
        return terrainType;

    }
}
