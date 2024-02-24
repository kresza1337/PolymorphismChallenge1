// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
      Car car = new Car("Toyota");
        runRace(car);
      Car ferrari = new GasPoweredCar("Ferrari", 15.3,6);
      runRace(ferrari);

      Car Tesla = new ElectricCar("Tesla", 433,70);
      runRace(Tesla);

      Car ferrariHybrid = new HybridCar("FerrariHybrid", 32.2,8, 213);
      runRace(ferrariHybrid);
    }
    public static void runRace(Car car){
        car.startEngine();
        car.drive();
        System.out.println();
    }
}