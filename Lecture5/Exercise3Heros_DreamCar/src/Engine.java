public class Engine {

    private boolean  isStarted;

    public Engine() {
        isStarted = false;
    }

    public void start(){
        if (!isStarted) {
            isStarted = true;
            System.out.println("The engine is started");
        } else {
            System.out.println("The engine is already started");
        }
    }

    public void stop(){
        if (isStarted) {
            isStarted = false;
            System.out.println("The engine stopped working");
        } else {
            System.out.println("The engine is already stopped");
        }
    }
}
