package GBJavaOOPSeminars.GBJavaOOPHomeworkSem7;

import GBJavaOOPSeminars.GBJavaOOPHomeworkSem7.model.Helicopter;
import GBJavaOOPSeminars.GBJavaOOPHomeworkSem7.model.JetSky;
import GBJavaOOPSeminars.GBJavaOOPHomeworkSem7.model.ATV;
import GBJavaOOPSeminars.GBJavaOOPHomeworkSem7.model.Aquabike;
import GBJavaOOPSeminars.GBJavaOOPHomeworkSem7.model.Byke;
import GBJavaOOPSeminars.GBJavaOOPHomeworkSem7.model.Car;
import GBJavaOOPSeminars.GBJavaOOPHomeworkSem7.model.Chassis;
import GBJavaOOPSeminars.GBJavaOOPHomeworkSem7.model.Engine;

public class main {
    public static void main(String[] args) {
        Engine engine = new Engine(23, 65, "E95");
        Chassis chassis = new Chassis(4, 100, 4, 200, 2, 1, 1, 1, 1);
        // Byke byke = new Byke(engine, chassis, "frame", 64.3f);

        // System.out.println(byke.toString());

        // ATV atv = new ATV(engine, chassis, "frame", 78.8f);
        // // String tmp = atv.toString().replace("Byke", "ATV"); // имутабельный тип
        // System.out.println(atv.toString());
        int[] ws = {205, 55, 16};
        // Car car = new Car(engine,chassis, "S", ws, 2680);
        // System.out.println(car.toString());
        // Helicopter helicopter = new Helicopter(engine, chassis, 3.5f, 1000, 37, 10);
        // System.out.println(helicopter.toString());
        // JetSky jetSky = new JetSky(engine, chassis, "s", "a", "intake system");
        // System.out.println(jetSky.toString());
        // System.out.println(jetSky.getEnvironment());
        // System.out.println(jetSky.getMaxSpeed());
        Byke suzuki = new Byke(engine, chassis, "SUZUKI SV650 ABS (SV650A)", "frame", 64.3f);
        System.out.println(suzuki.getEnvironment());
        System.out.println(suzuki.toString());

        // ATV rm = new ATV(engine, chassis, "RM 800 DUO", "frame", 64.3f);
        ATV rm = new ATV(engine, chassis, "RM 800 DUO", "frame", 64.3f);
        System.out.println(rm.getEnvironment());
        System.out.println(rm.toString());

        Car fordFiesta = new Car(engine, chassis, "Ford Fiesta", ws, 2680);
        System.out.println(fordFiesta.getEnvironment());
        System.out.println(fordFiesta.toString());
        // System.out.println(suzuki.getMaxSpeed(250));
        // Helicopter gen = new Helicopter(engine, chassis, 3.5f, 1000, 37, 10);

        Helicopter gen = new Helicopter(engine, chassis, "GEN H-4", 3.5f, 1000, 37, 10);
        System.out.println(gen.getEnvironment());
        System.out.println(gen.toString());

        Aquabike seaDooP = new Aquabike(engine, chassis, "SEA-DOO PERFORMANCE RXP-X 300", "frame", 65);
        System.out.println(seaDooP.getEnvironment());
        System.out.println(seaDooP.toString());
    }
}
