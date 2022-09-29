package GBJavaOOPSeminars.GBJavaOOPHomeworkSem5.heroTypes;

import java.util.List;
// import java.util.Random;
// import java.util.Comparator;

public class Wizard extends BaseHero {

    public Wizard(List<BaseHero> side, int x, int y) {
        super(side);
        name = ("Wizard");
        attack = 17;
        defence = 12;
        shoot = 0;
        damage = new Vector2(-4, -4);
        crntHeals = health = 30;
        speed = 9;
        delivery = false;
        magic = true;
        status = "stand";
        position = new Vector2(x, y);
    }

    // public boolean status() {return status.equals("active");}

    @Override
    public void step(List<BaseHero> side) {
        // int i = new Random().nextInt(super.list.size());
        int min = 0;
        BaseHero p = super.list.get(0);
        // if (!p.status.equals("Die")){
            // p.crntHeals -= damage.x;
            // if (p.crntHeals >= p.health) {
                // p.crntHeals = p.health;
            // }
        // }
        for (BaseHero i : super.list) {
            if (i.health - i.crntHeals > min && !p.status.equals("Die")) {
                min = 0;
                p = i;
            }
        }
        p.crntHeals -= damage.x;
    }
}
