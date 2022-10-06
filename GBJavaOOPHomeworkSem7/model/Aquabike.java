package GBJavaOOPSeminars.GBJavaOOPHomeworkSem7.model;


public class Aquabike extends Transport {
    private String brand;
    private final String frame; // рама
    private final float steering; // угол поворота стойки рулевого колеса

    public Aquabike(Engine engine, Chassis chassis, String brand, String frame, 
                float steering) {
        super(engine, chassis);
        this.brand = brand;
        this.frame = frame;
        this.steering = steering;
    }

    @Override
    public String toString() {
        return String.format("Type of vehicle: %s, Brand: %s, seats: %s, max speed: %s, steering: %s, volume of engine: %s", 
        getTypeOfVehicle(), brand, 2, chassis.getMaxSpeed(), steering, engine.getVolume());
    }

    private String getTypeOfVehicle() {
        typeOfVehicle = "Aquabike";
        return typeOfVehicle;
    }

    public String getEnvironment() {
        return "Водный транспорт";
    }
}