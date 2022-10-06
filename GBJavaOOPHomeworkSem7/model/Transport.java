package GBJavaOOPSeminars.GBJavaOOPHomeworkSem7.model;

public abstract class Transport {
    protected final Engine engine;
    protected final Chassis chassis;
    protected String typeOfVehicle;
    protected int maxSpeed;

    public Transport(Engine engine, Chassis chassis) {
        this.engine = engine;
        this.chassis = chassis;
    }

    public Transport(Engine engine, Chassis chassis, String typeOfVehicle, int maxSpeed) {
        this(engine, chassis);
        this.typeOfVehicle = typeOfVehicle;
        this.maxSpeed = maxSpeed;
    }
}
