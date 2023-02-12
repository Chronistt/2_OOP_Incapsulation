import transport.*;

public class Main {
    public static void main(String[] args) {
        Car car5 = new Car("Hyundai", "Avant", 1.6, new DriverB("Филипп Егорович", 12, true));
        System.out.println(car5); // распечатка созданного объекта
        Bus busLiaz = new Bus("ЛиАЗ", "-63325", 5.0, new DriverD("Аристарх Павлович", 40, true));
        System.out.println(busLiaz);
        Bus busKamaz = new Bus("КамАЗ", "-5712", 6.5, new DriverD("Анастасий Дамианович", 27, true));
        System.out.println(busKamaz);
        Bus busMercedes = new Bus("Мерседес", "Спринтер", 3.5,new DriverD("Иван Трофимович", 42, true));
        System.out.println(busMercedes);
        Truck truck1 = new Truck("Урал", "-65325", 8.4,new DriverC("Александр Павлович", 8,true));
        System.out.println(truck1);
        truck1.startMove();
        Truck truckGazelle = new Truck("Газель", "Некст", 6.5, new DriverC("Трофим Кузьмич", 36,true));
        System.out.println(truckGazelle);

        carInfo(busKamaz);
        carInfo(truck1);



    }
    public static void carInfo(Transport <?> transport) {
        System.out.println("водитель "+ transport.getDriver().getName() + " управляет автомобилем "+ transport.getBrand()+ "  и будет участвовать в заезде");
    }

 }
