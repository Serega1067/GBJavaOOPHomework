package GBJavaOOPSeminars.GBJavaOOPHomeworkSem4.heroTypes;

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

    public boolean status() {return status.equals("active");}

    @Override
    public void step() {
        boolean tmp = false;
        for (BaseHero bh: super.list) {
            if (bh.name.equals("Peasant")) {
                tmp = true;
                break;
            }
        }
        if (tmp) shoot++;
    }

}
