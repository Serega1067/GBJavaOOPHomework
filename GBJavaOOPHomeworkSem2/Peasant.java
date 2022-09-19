package GBJavaOOPSeminars.GBJavaOOPHomeworkSem2;

class Peasant extends BaseHero {

    public Peasant() {
        name = "P";
        attack = 1;
        protection = 1;
        shots = 0;
        damage = new int[] {1, 1};
        health = 1;
        speed = 3;
        delivery = true;
        magic = false;
    }
}
