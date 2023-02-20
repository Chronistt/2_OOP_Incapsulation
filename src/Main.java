import transport.*;

public class Main {
    public static void main(String[] args) {
        Car car5 = new Car("Hyundai", "Avanti", 1.6, new DriverB("Филипп Егорович", 12, true), BodyType.HATCHBACK );
        System.out.println(car5); // распечатка созданного объекта
        Car car4 = new Car("Hyundai", "Santa Cruz", 3.6, new DriverB("Максим Викторович", 3, true), BodyType.PICKUP);
        System.out.println(car4);
        Car car3 = new Car("Mazda", "3", 1.2, new DriverB("Лаврентий Павлович", 13, true), BodyType.SEDAN);
        System.out.println(car3);
        Car car2 = new Car("ВАЗ", "21043", 1.4, new DriverB("Анастас Робертович", 2, true), BodyType.UNIVERSAL);
        System.out.println(car2);
        Bus busLiaz = new Bus("ЛиАЗ", "-63325", 5.0, new DriverD("Аристарх Павлович", 40, true), Bus.BusCapacity.VERYLARGE);
        System.out.println(busLiaz);
        Bus busKamaz = new Bus("КамАЗ", "-5712", 6.5, new DriverD("Анастасий Дамианович", 27, true), Bus.BusCapacity.LARGE);
        System.out.println(busKamaz);
        Bus busMercedes = new Bus("Мерседес", "Спринтер", 3.5,new DriverD("Иван Трофимович", 42, true), Bus.BusCapacity.SMALL);
        System.out.println(busMercedes);
        Bus bus1 = new Bus("Ssang", "Young", 8.4, new DriverD("Кирилл Борисович", 8, true), Bus.BusCapacity.LARGE);
        System.out.println(bus1);
        Truck truck1 = new Truck("Урал", "-65325", 8.4,new DriverC("Александр Павлович", 8,true), Truck.TruckCapacity.N2);
        System.out.println(truck1);
        truck1.startMove();
        Truck truckGazelle = new Truck("Газель", "Некст", 6.5, new DriverC("Трофим Кузьмич", 36,true), Truck.TruckCapacity.N1);
        System.out.println(truckGazelle);
        Truck truckMaz = new Truck("Маз", "-4570", 12.5, new DriverC("Александр", 21, true), Truck.TruckCapacity.N3);
        System.out.println(truckMaz);

        System.out.println(truck1.passCheck());

        try {                       //проверка опасного кода
            busLiaz.passCheck();

        } catch (TransportTypeException e) { //обработка исключения
            System.out.println(e);  }
        System.out.println(car2.passCheck()); //проверка работоспособностикода дальше




    }
    public static void carInfo(Transport <?> transport) {
        System.out.println("водитель "+ transport.getDriver().getName() + " управляет автомобилем "+ transport.getBrand()+ "  и будет участвовать в заезде");
    }

 }
