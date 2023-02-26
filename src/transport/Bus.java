package transport;


import java.awt.*;
import java.util.ArrayList;

public class Bus extends Transport <DriverD> implements Competing {
BusCapacity busCapacity;
    public Bus(String brand, String model, double engineVolume, DriverD driver, ArrayList <Mechanic> mechanicList, BusCapacity busCapacity) {
        super(brand, model, engineVolume, driver, mechanicList);
        this.busCapacity = busCapacity;
    }
    public enum BusCapacity {
        VERYSMALL(0, 10),
        SMALL(11, 25),
        MEDIUM(26, 50),
        LARGE(51, 80),
        VERYLARGE(81, 120);

        Integer minCapacity;
        Integer maxCapacity;

        BusCapacity(Integer minCapacity, Integer maxCapacity) {
            this.minCapacity = minCapacity;
            this.maxCapacity = maxCapacity;
        }

        @Override
        public String toString() {
            return "Пассажировместимость от " + (minCapacity == null ? " " : String.valueOf(minCapacity)) + " до " + (maxCapacity == null ? " " : String.valueOf(maxCapacity));
        }
    }

    @Override
    public Type getType() {
        return Type.BUS;
    }
    @Override
    public void printType() {
        Type e = getType();
        System.out.println(String.valueOf(e));
    }

        @Override
        public String toString () {
            return brand + " " + model + " " + engineVolume+ " "+busCapacity;
        }
        @Override
        public void pitStop () {
            System.out.println("Bus is on pitstop");

        }

        @Override
        public void bestCircleTime () {
            System.out.println("Bus has the best circle time");
        }

    /*@Override
    public void passCheck() {
        System.out.println("Автобусы не проходят диагностику");
    }
*/
    @Override
    public void maxSpeed() {

    }
}


