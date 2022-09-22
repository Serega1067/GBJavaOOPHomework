package GBJavaOOPSeminars.GBJavaOOPHomeworkSem3;

import GBJavaOOPSeminars.GBJavaOOPHomeworkSem3.HeroInterface;

import java.util.List;

public abstract class BaseHero implements Actions{

    protected String name;
    protected int attack;
    protected int protection;
    protected int shots;
    protected Vector2 damage;
    protected int health;
    protected int crntHeals;
    protected int speed;
    protected boolean delivery;
    protected boolean magic = true;
    protected String status;
    protected Vector2 position;

    protected List<BaseHero> getList() {
        return list;
    }

    protected List<BaseHero> list;

    public BaseHero(List<BaseHero> side) {
        list = side;
    }

    @Override
    public String returnCondition() {
        return name + " H:" + crntHeals + " P:" + protection + " A:" + attack + " " + status;
    }

    public void step() {
    }

//     public BaseHero() {}

//     public String getName() {
//         return name;
//     }

//     public int getAttack() {
//         return attack;
//     }

//     public int getProtection() {
//         return protection;
//     }

//     public int getShots() {
//         return shots;
//     }

//     public int[] getDamage() {
//         return damage;
//     }

//     public int getHealth() {
//         return health;
//     }

//     public int getSpeed() {
//         return speed;
//     }

//     public boolean getDelivery() {
//         return delivery;
//     }

//     public boolean getMagic() {
//         return magic;
//     }

//     @Override
//     public float hit() {
//         // TODO Auto-generated method stub
//         return 0;
//     }

//     @Override
//     public float getHit(float demage) {
//         // TODO Auto-generated method stub
//         return 0;
//     }

//     @Override
//     public boolean status() {
//         // TODO Auto-generated method stub
//         return false;
//     }

//     @Override
//     public boolean changePosition() {
//         // TODO Auto-generated method stub
//         return false;
//     }

//     @Override
//     public String returnCondition() {
//         // TODO Auto-generated method stub
//         return null;
//     }
    
}
