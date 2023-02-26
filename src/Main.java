import transport.*;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Mechanic engineSpec = new Mechanic("Василий Иванович","СТО на Рублевке");
        Mechanic electroSpec = new Mechanic("Антон Николаевич", "Электрика у Палыча");
        Mechanic hydroSpec = new Mechanic("Александр Григорьевич" , "Гидросистемы");

        List <Mechanic> mechanicList = new ArrayList<>();
        mechanicList.add(electroSpec);
        mechanicList.add(engineSpec);
        mechanicList.add(hydroSpec);

        Car car5 = new Car("Hyundai", "Avanti", 1.6, new DriverB("Филипп Егорович", 12, true), new ArrayList<>(mechanicList),BodyType.HATCHBACK);
        System.out.println(car5); // распечатка созданного объекта
        Car car4 = new Car("Hyundai", "Santa Cruz", 3.6, new DriverB("Максим Викторович", 3, true), new ArrayList<>(mechanicList),BodyType.PICKUP);
        System.out.println(car4);
        Car car3 = new Car("Mazda", "3", 1.2, new DriverB("Лаврентий Павлович", 13, true), new ArrayList<>(mechanicList),BodyType.SEDAN);
        System.out.println(car3);
        Car car2 = new Car("ВАЗ", "21043", 1.4, new DriverB("Анастас Робертович", 2, true),new ArrayList<>(mechanicList), BodyType.UNIVERSAL);
        System.out.println(car2);
        Bus busLiaz = new Bus("ЛиАЗ", "-63325", 5.0, new DriverD("Аристарх Павлович", 40, true),new ArrayList<>(mechanicList), Bus.BusCapacity.VERYLARGE);
        System.out.println(busLiaz);
        Bus busKamaz = new Bus("КамАЗ", "-5712", 6.5, new DriverD("Анастасий Дамианович", 27, true), new ArrayList <> (mechanicList), Bus.BusCapacity.LARGE);
        System.out.println(busKamaz);
        Bus busMercedes = new Bus("Мерседес", "Спринтер", 3.5,new DriverD("Иван Трофимович", 42, true), new ArrayList <> (mechanicList), Bus.BusCapacity.SMALL);
        System.out.println(busMercedes);
        Bus bus1 = new Bus("Ssang", "Young", 8.4, new DriverD("Кирилл Борисович", 8, true), new ArrayList <> (mechanicList), Bus.BusCapacity.LARGE);
        System.out.println(bus1);
        Truck truck1 = new Truck("Урал", "-65325", 8.4,new DriverC("Александр Павлович", 8,true),new ArrayList<>(mechanicList), Truck.TruckCapacity.N2);
        System.out.println(truck1);
        truck1.startMove();
        Truck truckGazelle = new Truck("Газель", "Некст", 6.5, new DriverC("Трофим Кузьмич", 36,true), new ArrayList<>(mechanicList),Truck.TruckCapacity.N1);
        System.out.println(truckGazelle);
        Truck truckMaz = new Truck("Маз", "-4570", 12.5, new DriverC("Александр", 21, true),new ArrayList<>(mechanicList), Truck.TruckCapacity.N3);
        System.out.println(truckMaz);



      car5.printType();
        List<Transport> transportList = new ArrayList<>();

        transportList.add(0,busKamaz);
        transportList.add(1,busLiaz);
        transportList.add(2,car5);
        transportList.add(3,car4);
        transportList.add(4,truckGazelle);
        transportList.add(5,truckMaz);

        System.out.println(transportList);
        System.out.println(truckGazelle.getMechanicList());

        electroSpec.passCheck();

        Deque<Transport> queue = new LinkedList<>();
        queue.addLast(truckGazelle);
        queue.add(car2);
        queue.addLast(truckMaz);

        ServiceStation serviceQeueu = new ServiceStation(queue);
        serviceQeueu.putOnQueue(truckGazelle);
        serviceQeueu.putOnQueue(busKamaz);
        serviceQeueu.putOnQueue(truckMaz);
        serviceQeueu.putOnQueue(car4);

        serviceQeueu.passService(busKamaz);

        serviceQeueu.printQueue();


        Map <Transport, List <Mechanic>> carMechanics = new HashMap<>();
        carMechanics.put(truckGazelle, truckGazelle.getMechanicList());
        carMechanics.put(car5, car5.getMechanicList());
        System.out.println(carMechanics);

    }
    public static void carInfo(Transport <?> transport) {
        System.out.println("водитель "+ transport.getDriver().getName() + " управляет автомобилем "+ transport.getBrand()+ "  и будет участвовать в заезде");
    }

 }
