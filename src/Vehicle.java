public class Vehicle {
    protected int maxMiles;
    protected int drivenMiles;
    protected String vehicleType;
    protected Driver driver;
    protected int driverMinAge;

    public Vehicle(int maxMiles, String vehicleType, int drivenMiles, int driverMinAge) {
        this.maxMiles = maxMiles;
        this.vehicleType = vehicleType;
        this.drivenMiles = drivenMiles;
        this.driverMinAge = driverMinAge;

    }

    public void setDriver(Driver driver) {
        if (driver.getAge() >= driverMinAge) {
            this.driver = driver;
            System.out.println("hej");
        }
    }

    public void drive() {
        if (driver == null) {
            System.out.println(vehicleType + " didn’t drive - there’s no driver!");
        } else {
            maxMiles -= drivenMiles;
            System.out.println(vehicleType + " drove " + drivenMiles + " miles - " + maxMiles + " miles to go");
        }
    }

}
