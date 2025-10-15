public class Player {
    private int Strength;
    private int Health;

    public Player(int Strength, int Health) {
        this.Strength = Strength;
        this.Health = Health;
    }

    public boolean fight(Room room){
        if (Strength > room.getCreatureStrength()) {
            return true;
        }
        else {
            Health = Health - room.getCreatureStrength();
            if (Health > 0) {
                System.out.println("Player is still alive with health " + Health + " left");
                return true;
            }
            else {
                System.out.println("Player was defeated by creature");
                return false;
            }

        }
    }
}
