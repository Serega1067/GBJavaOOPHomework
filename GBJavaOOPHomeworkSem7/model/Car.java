package GBJavaOOPSeminars.GBJavaOOPHomeworkSem7.model;

public class Car extends Transport {
    private final String brand;
    private int[] wheel_size;
    private final int wheelbase;

    public Car(Engine engine, Chassis chassis, String brand, 
               int[] wheel_size, int wheelbase) {
        super(engine, chassis);
        this.brand = brand;
        this.wheelbase = wheelbase;
        this.wheel_size = new int[3];
        this.wheel_size = wheel_size;
    }

    @Override
    public String toString() {
        return String.format(
            "Type of vehicle: %s, drive: %s, seats: %s, " + 
            "max speed: %s, wheelbase: %s, volume of engine: %s, ", 
        getTypeOfVehicle(), brand, 4, 250f, wheelbase, 1.6f);
    }

    private String getTypeOfVehicle() {
        typeOfVehicle = "Car";
        return typeOfVehicle;
    }

    public String getEnvironment() {
        return "Наземный транспорт";
    }
}
