public class Hero {

    private int health;
    private int strength;

    public Hero(int health, int strength) {
        this.health = health;
        this.strength = strength;
    }

    public void displayStats() {
        System.out.println("Hero details: ");
        System.out.println("Strength: " + strength);
        System.out.println("Health: " + health);
    }

    public void takeDamage(int damage) {
        System.out.println("Taking damage: " + damage);
        if (damage > health) {
            System.out.println("Good bye");
        }
        this.health = this.health - damage;
    }

    public void powerUp(int power) {
        System.out.println("Adding power: " + power);

        this.strength = this.strength + power;
    }
}
