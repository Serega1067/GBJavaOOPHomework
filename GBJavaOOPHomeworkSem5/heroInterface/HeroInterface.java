package GBJavaOOPSeminars.GBJavaOOPHomeworkSem5.heroInterface;

import GBJavaOOPSeminars.GBJavaOOPHomeworkSem5.heroTypes.Vector2;
import GBJavaOOPSeminars.GBJavaOOPHomeworkSem5.heroTypes.BaseHero;

import java.util.List;

public interface HeroInterface {
    // boolean status();
    void setStatus();
    void step(List<BaseHero> side);
    String returnCondition();
    String getName();
    Vector2 getPosition();
}
