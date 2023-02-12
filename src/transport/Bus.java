package transport;

public class Bus extends Transport <DriverD> implements Competing{
    public Bus(String brand, String model, double engineVolume, DriverD driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public String toString() {
        return brand+" "+ model+" "+engineVolume;
    }
    @Override
    public void pitStop() {
        System.out.println("Bus is on pitstop");

    }

    @Override
    public void bestCircleTime() {
        System.out.println("Bus has the best circle time");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Bus's max speed");

    }
}

