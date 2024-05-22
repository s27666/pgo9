public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2020, 1574, 378);
        Truck truck = new Truck("Volvo", "Truck", 2014, 1410, 631, 22);
        car.calculateEfficiency();
        truck.calculateEfficiency();
    }
}