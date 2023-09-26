public class Car extends Vehicle{
    public Car () {
        super(100, "Car", 10, 18);
        // Går nedan att flytta över till att skrivas ut vid skapande av Vehicle?
        System.out.println(vehicleType + " created. " + maxMiles + " miles to go!");
    }
}
