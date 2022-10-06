package GBJavaOOPSeminars.GBJavaOOPHomeworkSem7.model;

public class Helicopter extends Transport {
    private String brand;
    private final float rotor_diametr;
    private final int ractical_range;
    private final int ceiling;
    private final int rate_of_climb;

    public Helicopter(Engine engine, Chassis chassis, String brand, 
                      float rotor_diametr, int ractical_range, 
                      int ceiling, int rate_of_climb) {
        super(engine, chassis);
        this.brand = brand;
        this.rotor_diametr = rotor_diametr;
        this.ractical_range = ractical_range;
        this.ceiling = ceiling;
        this.rate_of_climb = rate_of_climb;
    }

    @Override
    public String toString() {
        return String.format(
            "Type of vehicle: %s, Brand: %s, rotor diametr: %s, seats: %s, " +
            "max speed: %s, ractical range: %s, volume of engine: %s " + 
            "ceiling: %s, rate of climb: %s", 
            getTypeOfVehicle(), brand, rotor_diametr, 4, 350f, ractical_range, 16f, 
            ceiling, rate_of_climb
        );
    }

    private String getTypeOfVehicle() {
        typeOfVehicle = "Helicopter";
        return typeOfVehicle;
    }

    public String getEnvironment() {
        return "Воздушный транспорт";
    }
}
