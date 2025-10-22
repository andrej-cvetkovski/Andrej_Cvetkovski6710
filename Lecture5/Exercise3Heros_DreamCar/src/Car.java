public class Car {

    private Engine engine;
    private Wheel[] wheels;
    private Door[] doors;
    private boolean isClosedTrunk;

    public Car(int numberWheels, int numberDoors) {
        engine = new Engine();
        wheels = new Wheel[numberWheels];
        doors = new Door[numberDoors];
        isClosedTrunk = true;

        for (int i = 0; i < numberDoors; i++){
            doors[i] = new Door();
        }

        for (int i = 0; i < numberWheels; i++){
            wheels[i] = new Wheel();
        }
    }

    public void startEngine(){
        engine.start();
    }

    public void stopEngine(){
        engine.stop();
    }

    public void openAllDoors() {
        for (Door door : doors) {
            door.openDoor();
        }
    }

    public void closeAllDoors() {
        for (Door door : doors) {
            door.closeDoor();
        }
    }

    public void inflateWheel(int index){
        if (index >= 0 && index < wheels.length) {
            wheels[index].inflateWheel();
        } else {
            System.out.println("Invalid wheel index");
        }
    }

    public void deflateWheel(int index){
        if (index >= 0 && index < wheels.length) {
            wheels[index].deflateWheel();
        } else {
            System.out.println("Invalid wheel index");
        }
    }

    public void openTrunk(){
        if (isClosedTrunk) {
            isClosedTrunk = true;
            System.out.println("Trunk opened");
        } else {
            System.out.println("Trunk already opened");
        }
    }

    public void closeTrunk(){
        if (!isClosedTrunk) {
            isClosedTrunk = false;
            System.out.println("Trunk closed");
        } else {
            System.out.println("Trunk already closed");
        }
    }


}
