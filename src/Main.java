import transport.Car;

public class Main {
    public static void main(String[] args) {
        Car car5 = new Car("Hyundai", "Avant", 1.6, "оранжевый", "Korea",2016, "auto", "cabriolet", 13245, 4,true);
        System.out.println(car5); // распечатка созданного объекта
        car5.changeTyre(11); //функционал по смене резины
               System.out.println(car5); //распечатка объекта после смены резины
    }
}