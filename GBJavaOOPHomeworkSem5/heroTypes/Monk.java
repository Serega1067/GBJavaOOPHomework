package GBJavaOOPSeminars.GBJavaOOPHomeworkSem5.heroTypes;

import java.util.List;
// import java.util.Random;

public class Monk extends BaseHero {
    public Monk(List<BaseHero> side, int x, int y){
        super(side);
        name = ("Monk");
        attack = 12;
        defence = 7;
        shoot = 0;
        damage = new Vector2(-4, -4);
        crntHeals = health = 30;
        speed = 5;
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
        // if (!p.status.equals("Die.")){
            // super.list.get(i).crntHeals -= damage.x;
            // if (super.list.get(i).crntHeals >= super.list.get(i).health) {
                // super.list.get(i).crntHeals = super.list.get(i).health;
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
