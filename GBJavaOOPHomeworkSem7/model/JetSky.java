package GBJavaOOPSeminars.GBJavaOOPHomeworkSem7.model;

public class JetSky extends Transport {
    private final String body_type;
    private final String body_material;
    private final String intake_system;

    public JetSky(Engine engine, Chassis chassis, String body_type, 
                  String body_materal, String intake_system) {
        super(engine, chassis);
        this.body_type = body_type;
        this.body_material = body_materal;
        this.intake_system = intake_system;
    }

    @Override
    public String toString() {
        return String.format(
            "Type of vehicle: %s, body type: %s, seats: %s, " + 
            "max speed: %s, body material: %s, volum of engine: %s, intake_system: %s", 
            getTypeOfVehicle(), body_type, 4, 50f, body_material, 6f, intake_system
        );
    }

    private String getTypeOfVehicle() {
        typeOfVehicle = "Jet Sky";
        return typeOfVehicle;
    }

    public String getEnvironment() {
        return "Воздушный транспорт";
    }

    public String getMaxSpeed() {
        return "Максимальная скорость";
    }
}
