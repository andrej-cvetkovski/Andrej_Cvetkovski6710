public class Door {

    private boolean isOpen;

    public Door() {
        this.isOpen = false;
    }

    public void openDoor(){
        if (!isOpen) {
            isOpen = true;
            System.out.println("Door is open");
        } else {
            System.out.println("Door is already opened");
        }
    }

    public void closeDoor(){
        if (isOpen) {
            isOpen = false;
            System.out.println("Door is closed");
        } else {
            System.out.println("Door is already closed");
        }
    }
}
