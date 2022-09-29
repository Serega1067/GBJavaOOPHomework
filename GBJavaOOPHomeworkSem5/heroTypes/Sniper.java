package GBJavaOOPSeminars.GBJavaOOPHomeworkSem5.heroTypes;

import java.util.List;

public class Sniper extends BaseHero {

    public Sniper(List<BaseHero> side, int x, int y){
        super(side);
        name = ("Sniper");
        attack = 12;
        defence = 10;
        shoot = 32;
        damage = new Vector2(1, 5);
        crntHeals = health = 15;
        speed = 9;
        delivery = false;
        magic = false;
        status = "stand";
        position = new Vector2(x, y);
    }

    // public boolean status() {return status.equals("active");}

    @Override
    public void step(List<BaseHero> side) {
        boolean tmp = false;
        for (BaseHero bh: super.list) {
            if (bh.name.equals("Peasant") && bh.name.equals("stand")) {
                tmp = true;
                bh.name = "busy";
                break;
            }
        }

        // if (tmp) shoot++;

        Vector2 target = super.getDistance(side);
        float dd = (damage.x+damage.y)/2;
        int d = (int) Math.round(dd + (dd/10)*(5-target.y));
        side.get((int)target.x).crntHeals -= d;
        if (!tmp) shoot--;
    }
}
