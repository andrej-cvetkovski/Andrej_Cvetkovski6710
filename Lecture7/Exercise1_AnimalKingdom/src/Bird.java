public class Bird implements Animal {

    @Override
    public void sound(){
        System.out.println("Bird makes squicking sound");
    }
    @Override
    public void move(){
        System.out.println("Bird flies in the sky");
    }

    @Override
    public void sleep() {
        System.out.println("Bird sleeps on trees");
    }
}
