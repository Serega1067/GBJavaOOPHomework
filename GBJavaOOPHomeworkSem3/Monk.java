package GBJavaOOPSeminars.GBJavaOOPHomeworkSem3;

import java.util.List;
import java.util.Random;

public class Monk extends BaseHero {

    public Monk(List<BaseHero> side, int x, int y) {
        super(side);
        name = "M";
        attack = 12;
        protection = 7;
        shots = 0;
        damage = new Vector2(-4, -4);
        crntHeals = health = 30;
        speed = 5;
        delivery = false;
        magic = true;
        status = "stand";
        position = new Vector2(x, y);
    }

    public boolean status() {
        return status.equals("active");
    }

    @Override
    public void step() {
        Random rnd = new Random();
        list.get(rnd.nextInt(list.size())).health -= damage.x;
    }

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
