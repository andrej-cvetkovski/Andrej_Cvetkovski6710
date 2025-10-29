public class StrengthHero extends SuperHero {

    public StrengthHero(String heroName) {
        super(heroName);
    }

    @Override
    public void fight() {
        System.out.println(heroName + " uses super strength to fight enemies ");
    }
}
