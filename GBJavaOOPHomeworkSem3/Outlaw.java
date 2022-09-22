package GBJavaOOPSeminars.GBJavaOOPHomeworkSem3;

import java.util.List;

public class Outlaw extends BaseHero {

    public Outlaw(List<BaseHero> side, int x, int y) {
        super(side);
        name = "O";
        attack = 8;
        protection = 3;
        shots = 0;
        damage = new Vector2(2, 4);
        crntHeals = health = 10;
        speed = 6;
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
