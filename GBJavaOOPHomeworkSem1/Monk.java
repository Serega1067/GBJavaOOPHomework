package GBJavaOOPSeminars.GBJavaOOPHomeworkSem1;

public class Monk {

    private String name;
    private int attack;
    private int protection;
    private int shots;
    private int[] damage;
    private int health;
    private int speed;
    private boolean delivery;
    private boolean magic;

    public Monk() {
        name = "M";
        attack = 12;
        protection = 7;
        shots = 0;
        damage = new int[] {-4, -4};
        health = 30;
        speed = 5;
        delivery = false;
        magic = true;
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
    public Monk(String name, int attack, int protection, 
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
