public class HybridCar extends Car{
    private double avgKmPerCharge;
    private int cylinders= 6;

    private int batterySize;

    public HybridCar(String description) {
        super(description);
    }

    public HybridCar(String description, double avgKmPerLitre, int cylinders, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerLitre;
        this.cylinders = cylinders;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.printf("HYBRID ->  %d cylinders are fired up %n", cylinders);
        System.out.printf("HYBRID ->  %s kWh battery on %n", batterySize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("HYBRID -> usage under avg %.2f %n", avgKmPerCharge);
    }
}
