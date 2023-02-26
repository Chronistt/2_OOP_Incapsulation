package transport;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation {
    Deque<Transport> serviceQueue;


    public ServiceStation(Deque<Transport> serviceQueue) {
        this.serviceQueue = serviceQueue;
    }

    public void putOnQueue(Transport car) {
        serviceQueue.addLast(car);
        System.out.println("Транспортное средство " + car.getBrand() + " " + car.getModel() + " поставлено на тех. обслуживание");
    }

    public void passService(Transport car) {
        serviceQueue.pop();
        System.out.println("Авто " + car.getBrand() + " " + car.getModel() + " прошло обслуживание");
    }

    Transport carQueue;
    public void printQueue() {
        while ((carQueue = serviceQueue.poll()) != null) {
             System.out.println(carQueue);
        }
    }
}

