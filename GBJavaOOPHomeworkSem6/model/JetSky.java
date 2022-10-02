package GBJavaOOPSeminars.GBJavaOOPHomeworkSem6.model;

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
}
