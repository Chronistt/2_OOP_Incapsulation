package transport;

public abstract class Transport <T extends Driver> {
    final String brand;
    final String model;
    final double engineVolume;

    private T driver;

    public Transport(String brand, String model, double engineVolume, Driver driver) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.driver = (T) driver;
    }


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }
    public void startMove() {
        System.out.println("поехали");
    }
    public void stopMove(){
        System.out.println("приехали");
    }

    public T getDriver() {
        return driver;
    }

  public abstract Type getType ();
    public abstract void printType();
}

