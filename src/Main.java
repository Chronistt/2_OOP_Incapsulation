import transport.Bus;
import transport.Car;

public class Main {
    public static void main(String[] args) {
        Car car5 = new Car("Hyundai", "Avant", 1.6, "оранжевый", "Korea",2016, 100,"auto", "cabriolet", 13245, 4,true);
        System.out.println(car5); // распечатка созданного объекта
        car5.changeTyre(11); //функционал по смене резины
               System.out.println(car5); //распечатка объекта после смены резины
        Bus busLiaz = new Bus("ЛиАЗ", "-63325", "синий", "Россия", 2019, 80);
        System.out.println(busLiaz);
        Bus busKamaz = new Bus("КамАЗ", "-5712", "зеленый", "Россия", 2021, 95);
        System.out.println(busKamaz);
        Bus busMercedes = new Bus("Мерседес", "Спринтер", "белый", "Испания", 2005, 120);
        System.out.println(busMercedes);
    }

}