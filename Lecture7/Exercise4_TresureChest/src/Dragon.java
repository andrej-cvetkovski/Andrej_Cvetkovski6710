public class Dragon implements MagicalCreature,Guardian,Curser{

    private String name;
    private String treasuer;
    private int curseDamage;

    public Dragon(String name, String treasuer, int curseDamage) {
        this.name = name;
        this.treasuer = treasuer;
        this.curseDamage = curseDamage;
    }

    public int getCurseDamage() {
        return curseDamage;
    }

    @Override
    public void interact(){
        System.out.println("Getting in interaction with the dragon" + name);
    }
    @Override
    public void guardTreasure(){
        System.out.println("Dragon " + name + "Guards the treasure" + treasuer);
    }
    @Override
    public void castCurse(int damagePoints){
        System.out.println("Dragon" + name + "Makes" + damagePoints);
    }

}
