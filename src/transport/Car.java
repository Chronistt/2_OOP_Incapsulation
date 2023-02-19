package transport;

public class Car extends Transport <DriverB> implements Competing {
BodyType bodyType;
    public Car(String brand, String model, double engineVolume, DriverB driver, BodyType bodyType) {
        super(brand, model, engineVolume, driver);
        this.bodyType=bodyType;
    }

    @Override
    public Type getType() {
        return Type.CAR;
    }
    @Override
    public void printType() {
        Type e = getType();
        System.out.println(e);
    }

    @Override
    public String toString() {
        return  brand+" "+ model+" "+ engineVolume +" "+ bodyType;
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

