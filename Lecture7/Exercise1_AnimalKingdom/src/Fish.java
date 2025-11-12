public class Fish implements Animal {
    @Override
    public void sound(){
        System.out.println("Fish make bubbling sound");
    }
    @Override
    public void move(){
        System.out.println("Fish swims in the sea");
    }

    @Override
    public void sleep() {
        System.out.println("Fish doesn't sleep");
    }

}
