public class Goblin implements MagicalCreature,Guardian,Curser {

    private String name;
    private String treasure;
    private int curseDamage;

    public Goblin(String name, String treasure, int curseDamage) {
        this.name = name;
        this.treasure = treasure;
        this.curseDamage = curseDamage;
    }

    public int getCurseDamage() {
        return curseDamage;
    }

    @Override
    public void castCurse(int damagePoints) {
        System.out.println("Goblin cast a curse with " + damagePoints);
    }

    @Override
    public void guardTreasure() {
        System.out.println("Goblin " + name + " guarding treasure" + treasure);

    }

    @Override
    public void interact() {
        System.out.println("Interacting with goblin...");
    }
}
