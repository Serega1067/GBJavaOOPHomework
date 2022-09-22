package GBJavaOOPSeminars.GBJavaOOPHomeworkSem3;

import java.util.List;

public class Peasant extends BaseHero {

    public Peasant(List<BaseHero> side, int x, int y) {
        super(side);
        name = "P";
        attack = 1;
        protection = 1;
        shots = 0;
        damage = new Vector2(1, 1);
        health = 1;
        speed = 3;
        delivery = true;
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
