public class Lion implements Animal{

    @Override
    public void sound(){
        System.out.println("Lion makes roaring sound");
    }
    @Override
    public void move(){
        System.out.println("LIon walks on ground");
    }

    @Override
    public void sleep() {
        System.out.println("Lion sleeps in the jungle");
    }
}
