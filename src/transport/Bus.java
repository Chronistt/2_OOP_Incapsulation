package transport;

public class Bus extends Transport {
    public Bus(String brand, String model, String color, String productionCountry, int productionYear, int maxSpeed) {
        super(brand, model, color, productionCountry, productionYear, maxSpeed);
    }

    @Override
    public String toString() {
        return brand+" "+ model+" "+color + " "+productionCountry + " "+ productionYear+" "+maxSpeed+" km/h ";
    }
}

