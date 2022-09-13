package GBJavaOOPSeminars.GBJavaOOPHomeworkSem1;

public class Outlaw {

    private String name;
    private int attack;
    private int protection;
    private int shots;
    private int[] damage;
    private int health;
    private int speed;
    private boolean delivery;
    private boolean magic;

    public Outlaw() {
        name = "O";
        attack = 8;
        protection = 3;
        shots = 0;
        damage = new int[] {2, 4};
        health = 10;
        speed = 6;
        delivery = false;
        magic = false;
    }

    /**
     * Дополнительный конструктор с пораметрами имён
     * @param name
     * @param attack
     * @param protection
     * @param shots
     * @param damage
     * @param health
     * @param speed
     * @param delivery
     * @param magic
     */
    public Outlaw(String name, int attack, int protection, 
                    int shots, int[] damage, int health, 
                    int speed, boolean delivery, boolean magic) {
        this();
        this.name = name;
        this.attack = attack;
        this.protection = protection;
        this.shots = shots;
        this.damage = damage;
        this.health = health;
        this.speed = speed;
        this.delivery = delivery;
        this.magic = magic;
    }

    public String getName() {
        return name;
    }

    public int getAttack() {
        return attack;
    }

    public int getProtection() {
        return protection;
    }

    public int getShots() {
        return shots;
    }

    public int[] getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean getDelivery() {
        return delivery;
    }

    public boolean getMagic() {
        return magic;
    }
}
