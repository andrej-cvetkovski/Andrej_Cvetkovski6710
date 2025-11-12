public class FlyingCar implements Vehicle,AirTransport {

    private double fuelCapacity;
    private int passangerCapacity;
    private String terrainType;

    private double maxAltitude;

    @Override
    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public int getPassangerCapacity() {
        return passangerCapacity;
    }

    public void setPassangerCapacity(int passangerCapacity) {
        this.passangerCapacity = passangerCapacity;
    }

    public String getTerrainType() {
        return terrainType;
    }

    public void setTerrainType(String terrainType) {
        this.terrainType = terrainType;
    }

    public void setMaxAltitude(double maxAltitude) {
        this.maxAltitude = maxAltitude;
    }

    @Override
    public void fly(){
        return
    }
    @Override
    public double getMaxAltitude(){

    }


}
