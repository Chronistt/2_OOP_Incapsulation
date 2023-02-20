package transport;

public class Truck extends Transport <DriverC> implements Competing{
    TruckCapacity truckCapacity;
    public Truck(String brand, String model, double engineVolume, DriverC driver, TruckCapacity truckCapacity) {
        super(brand, model, engineVolume, driver);
        this.truckCapacity = truckCapacity;
    }
    public enum TruckCapacity {
        N1 (0f, 3.5f),
        N2(3.5f, 12f),
        N3 (12f, null);
        private Float minCapacity;
        private Float maxCapacity;
        TruckCapacity (Float minCapacity, Float maxCapacity) {
            this.minCapacity = minCapacity;
            this.maxCapacity= maxCapacity;


        }

        @Override
        public String toString() {
            return "Грузоподъемность грузовика от " + (minCapacity==null?" ": String.valueOf(minCapacity)) + " до " + (maxCapacity==null?" ":String.valueOf(maxCapacity));
        }
    }
    @Override
    public Type getType() {
        return Type.TRUCK;
    }
    @Override
    public void printType() {
        Type e = getType();
        System.out.println(String.valueOf(e));
    }
    @Override
    public String toString() {
        return brand + " " + model + " " + engineVolume+ " " + truckCapacity;
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
    @Override
    public String passCheck() throws TransportTypeException {
        return "Грузовик прошел проверку";
    }
    }
