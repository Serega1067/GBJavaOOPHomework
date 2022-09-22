package GBJavaOOPSeminars.GBJavaOOPHomeworkSem3;

import java.util.List;

public class Magician extends BaseHero {

    public Magician(List<BaseHero> side, int x, int y) {
        super(side);
        name = "Mag";
        attack = 17;
        protection = 12;
        shots = 0;
        damage = new Vector2(-5, -5);
        crntHeals = health = 30;
        speed = 9;
        delivery = false;
        magic = true;
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

    // @Override
    // public int getAttack() {
    //     // TODO Auto-generated method stub
    //     return super.getAttack();
    // }
}
