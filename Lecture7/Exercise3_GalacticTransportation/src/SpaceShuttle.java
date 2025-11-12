public class SpaceShuttle implements Vehicle,AirTransport,SpaceTransport {

    private double fuelCapacity;
    private int passangerCapacity;
    private double orbitRange;

    private double maxAltitude;

    public SpaceShuttle(double fuelCapacity, int passangerCapacity, double orbitRange, double maxAltitude) {
        this.fuelCapacity = fuelCapacity;
        this.passangerCapacity = passangerCapacity;
        this.orbitRange = orbitRange;
        this.maxAltitude = maxAltitude;
    }

   @Override
    public void fly(){
        return fly;
   }
   @Override
   public double getMaxAltitude(){
        return maxAltitude;
   }

   @Override
   public void launch(){
        return launch;
   }
   @Override
   public double getOrbitRange(){
        return getOrbitRange;
   }
}
