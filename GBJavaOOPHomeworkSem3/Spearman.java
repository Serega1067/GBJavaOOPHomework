package GBJavaOOPSeminars.GBJavaOOPHomeworkSem3;

import java.util.List;

public class Spearman extends BaseHero {

    public Spearman(List<BaseHero> side, int x, int y) {
        super(side);
        name = "Sp";
        attack = 4;
        protection = 5;
        shots = 0;
        damage = new Vector2(1, 3);
        crntHeals = health = 10;
        speed = 4;
        delivery = false;
        magic = false;
        status = "stand";
        position = new Vector2(x, y);
    }

    public boolean status() {
        return status.equals("active");
    }

    public void step () {}

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
