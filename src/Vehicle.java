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
        System.out.println(vehicleType + " created. " + maxMiles + " miles to go!");
    }

    public void setDriver(Driver driver) {
        String driverName = driver.getName();
        int driverAge = driver.getAge();
        if (driver.getAge() >= driverMinAge) {
            this.driver = driver;
            System.out.println("Driver changed to " + driverName);
        } else {
            System.out.println("Driver not changed! " + driverName + " is " + driverAge + " but must be " + driverMinAge + " or older to drive " + vehicleType.toLowerCase());
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
