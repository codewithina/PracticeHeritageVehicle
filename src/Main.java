public class Main {
    public static void main(String[] args) {
        Driver d1 = new Driver("Emilia", 17);
        Driver d2 = new Driver("Niklas", 21);
        // Prints “Car created. 100 miles to go!”
        Vehicle v1 = new Car();
        // Prints “Tank created. 2000 miles to go!”
        Vehicle v2 = new MilitaryTank();
        // Prints “Car didn’t drive - there’s no driver!”
        v1.drive();
        // Prints “Tank didn’t drive - there’s no driver!”
        v2.drive();
        // Prints “Driver not changed! Emilia is 17, but must be 18 or older to drive car”
        v1.setDriver(d1);
        // Prints “Driver changed to Niklas”
        v1.setDriver(d2);
        // Prints “Driver not changed! Niklas is 21, but must be 25 or older to drive tank”
        v2.setDriver(d2);
        // Prints “Driver changed to TankMan”
        v2.setDriver(new Driver("TankMan", 300));
        // Prints “Car drove 10 miles - 90 miles to go”
        v1.drive();
        // Prints “Tank drove 5 miles - 1995 miles to go”
        v2.drive();
    }
}