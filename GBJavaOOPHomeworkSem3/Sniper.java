package GBJavaOOPSeminars.GBJavaOOPHomeworkSem3;

import java.util.List;

public class Sniper extends BaseHero {

    public Sniper(List<BaseHero> side, int x, int y) {
        super(side);
        name = "S";
        attack = 12;
        protection = 10;
        shots = 32;
        damage = new Vector2(8, 10);
        crntHeals = health = 15;
        speed = 9;
        delivery = false;
        magic = false;
        status = "stand";
        position = new Vector2(x, y);
    }

    public boolean status() {
        return status.equals("active");
    }

    public void step() {}

    @Override
    public float hit() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public float getHit(float demage) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean changePosition() {
        // TODO Auto-generated method stub
        return false;
    }
}
