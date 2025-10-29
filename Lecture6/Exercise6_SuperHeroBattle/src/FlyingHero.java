public class FlyingHero extends SuperHero {

    public FlyingHero(String heroName) {
        super(heroName);
    }

    @Override
    public void fight() {
        System.out.println(heroName + " takes up in the skies and attacks from above");
    }

}
