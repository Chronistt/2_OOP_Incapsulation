package transport;

public class Truck extends Transport <DriverC> implements Competing{
    public Truck(String brand, String model, double engineVolume, DriverC driver) {

        super(brand, model, engineVolume, driver);
    }
    @Override
    public String toString() {
        return brand + " " + model + " " + engineVolume;
    }
    @Override
    public void pitStop() {
        System.out.println("Truck is on pitstop");

    }

    @Override
    public void bestCircleTime() {
        System.out.println("Truck has the best circle time");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Truck's max speed");

    }
}
