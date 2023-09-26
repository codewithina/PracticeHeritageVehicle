public class MilitaryTank extends Vehicle{
    public MilitaryTank () {
        super(2000, "Tank", 5, 25);
        // Går nedan att flytta över till att skrivas ut vid skapande av Vehicle?
        System.out.println(vehicleType + " created. " + maxMiles + " miles to go!");
    }
}
