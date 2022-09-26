package GBJavaOOPSeminars.GBJavaOOPHomeworkSem4.heroInterface;

import GBJavaOOPSeminars.GBJavaOOPHomeworkSem4.heroTypes.Vector2;

public interface HeroInterface {
    boolean status();
    void step();
    String returnCondition();
    String getName();
    Vector2 getPosition();
}
