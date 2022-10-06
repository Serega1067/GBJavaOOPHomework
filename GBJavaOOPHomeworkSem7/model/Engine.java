package GBJavaOOPSeminars.GBJavaOOPHomeworkSem7.model;

public class Engine {
    private final float volume;
    private final float power;
    private final String fuel;

    public Engine(float volume, float power, String fuel) {
        this.volume = volume;
        this.power = power;
        this.fuel = fuel;
    }

    public float getVolume() {
        return volume;
    }

    public float getPower() {
        return power;
    }

    public String getFuel() {
        return fuel;
    }
}
