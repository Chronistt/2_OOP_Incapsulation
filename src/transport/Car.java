package transport;

public class Car extends Transport <DriverB> implements Competing {

    public Car(String brand, String model, double engineVolume, DriverB driver) {
        super(brand, model, engineVolume, driver);
    }


    @Override
    public String toString() {
        return  brand+" "+ model+" "+ engineVolume;
    }

    @Override
    public void pitStop() {
        System.out.println("Car is on pitstop");

    }

    @Override
    public void bestCircleTime() {
        System.out.println("Car has the best circle time");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Car's max speed");

    }
}

