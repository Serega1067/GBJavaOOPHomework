package GBJavaOOPSeminars.GBJavaOOPHomeworkSem7.model;

public class Byke extends Transport {
    private String brand;
    private int seats = 2;
    private final String frame; // рама
    private final float steering; // угол поворота стойки рулевого колеса

    public Byke(Engine engine, Chassis chassis, String brand, String frame, 
                float steering) {
        super(engine, chassis);
        this.brand = brand;
        this.seats = seats;
        this.frame = frame;
        this.steering = steering;
    }

    @Override
    public String toString() {
        return String.format("Type of vehicle: %s, Brand: %s, seats: %s, max speed: %s, steering: %s, volume of engine: %s", 
        getTypeOfVehicle(), brand, seats, chassis.getMaxSpeed(), steering, engine.getVolume());
    }

    private String getTypeOfVehicle() {
        typeOfVehicle = "Byke";
        return typeOfVehicle;
    }

    public String getEnvironment() {
        return "Наземный транспорт";
    }

    // public String getMaxSpeed(int maxSpeed) {
    //     return String.format("Максимальная скорость: %s", maxSpeed);
    // }
}
