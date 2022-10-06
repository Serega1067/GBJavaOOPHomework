package GBJavaOOPSeminars.GBJavaOOPHomeworkSem7.model;

public class ATV extends Byke {
    private String brand;

    public ATV(Engine engine, Chassis chassis, String brand, String frame, 
               float steering) {
        super(engine, chassis, brand, frame, steering);
        this.brand = brand;

    }

    @Override
    public String toString() {
        return String.format(
            "Type of vehicle: %s, Brand: %s, seats: %s, max speed: %s, steering: %s, volume of engine: %s", 
            getTypeOfVehicle(), brand, 2, 150f, "steering", 1.6f
        );
    }

    private String getTypeOfVehicle() {
        typeOfVehicle = "ATV";
        return typeOfVehicle;
    }
}
