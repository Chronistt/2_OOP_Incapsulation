package transport;

import java.awt.*;
import java.util.ArrayList;

public abstract class Transport <T extends Driver> {
    final String brand;
    final String model;
    final double engineVolume;

    private T driver;
    private ArrayList<Mechanic> mechanicList;

    public Transport(String brand, String model, double engineVolume, Driver driver, ArrayList<Mechanic> mechanicList) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.driver = (T) driver;
        this.mechanicList = mechanicList;
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

    public ArrayList<Mechanic> getMechanicList() {
        return mechanicList;
    }

    public abstract Type getType ();
    public abstract void printType();
    //public abstract passCheck();
}

