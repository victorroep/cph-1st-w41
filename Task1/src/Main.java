package src;
public class Main {
    public static void main(String[] args) {
        //1.H
        Driver driver = new Driver("Victor", 21);

        //1.I
        Car car = new Car("Tesla", "Model S", 2021, "Hatchback");

        //1.J
        car.setDriver(driver);

        //1.K
        System.out.println(car.toString() + car.getDriver().toString());

        //1.L
        Car car1 = new Car("Fiat", "500", 1957, "Convertible");
        car1.setDriver(driver);

        //1.M
        System.out.println(car1.toString());
    }
}
