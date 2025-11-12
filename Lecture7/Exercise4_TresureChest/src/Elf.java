public class Elf implements MagicalCreature,Guardian,Healer {

    private String name;
    private String treasure;
    private int healingPower;


    public Elf(String name, String treasure, int healingPower) {
        this.name = name;
        this.treasure = treasure;
        this.healingPower = healingPower;
    }

    public int getHealingPower() {
        return healingPower;
    }

    @Override
    public void guardTreasure() {
        System.out.println("Elf guarding the treasure " + treasure);
    }

    @Override
    public void healPlayer(int healthPoints) {
        System.out.println("elf is healing player with " + healingPower + "points");
    }

    @Override
    public void interact() {
        System.out.println("Interacting with Elf...");
    }
}
