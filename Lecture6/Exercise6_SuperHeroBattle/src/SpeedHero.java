public class SpeedHero extends SuperHero {

    public SpeedHero(String heroName) {
        super(heroName);
    }

    @Override
    public void fight() {
        System.out.println(heroName + " makes fast movement and avoids attacks");
    }
}
