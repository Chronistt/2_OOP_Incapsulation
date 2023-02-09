package transport;

public class Transport {
    final String brand;
    final String model;
    String color;
    final String productionCountry;
    final int productionYear;
    int maxSpeed;

    public Transport(String brand, String model, String color, String productionCountry, int productionYear, int maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.productionCountry = productionCountry;
        this.productionYear = productionYear;
        this.maxSpeed = maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setColor(String color) {
        if (color==null||color.isEmpty()) {
            this.color = "без цвета"
        } else
            this.color = color;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed==null||maxSpeed<=0) {
            this.maxSpeed = 10;
            } else
        this.maxSpeed = maxSpeed;
    }
}

