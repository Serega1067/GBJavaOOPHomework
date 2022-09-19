package GBJavaOOPSeminars.GBJavaOOPHomeworkSem2;

class Magician extends BaseHero {

    public Magician() {
        super.
        name = "Mag";
        attack = 17;
        protection = 12;
        shots = 0;
        damage = new int[] {-5, -5};
        health = 30;
        speed = 9;
        delivery = false;
        magic = true;
    }

    @Override
    public int getAttack() {
        // TODO Auto-generated method stub
        return super.getAttack();
    }
}
