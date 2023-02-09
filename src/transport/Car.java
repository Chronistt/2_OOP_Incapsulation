package transport;

public class Car {
    final String brand;
    final String model;
    double engineVolume;
    String color;
    final String productionCountry;
    final int productionYear;
    String transmission;
    final String bodyType;
    int registerNumber;
    final int seats;
    boolean tyreType;
        String printTyreType;


    public Car(String brand, String model, double engineVolume, String color, String productionCountry, int productionYear, String transmission, String bodyType, int registerNumber, int seats, boolean tyreType) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.productionCountry = productionCountry;
        this.productionYear = productionYear;
        this.transmission = transmission;
        this.bodyType = bodyType;
        this.registerNumber = registerNumber;
        this.seats = seats;
        this.tyreType = tyreType;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getSeats() {
        return seats;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public String getTransmission() {
        return transmission;
    }

    public int getRegisterNumber() {
        return registerNumber;
    }

    public boolean isTyreType() {
        return tyreType;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setRegisterNumber(int registerNumber) {
        this.registerNumber = registerNumber;
    }

    public boolean setTyreType(boolean tyreType) {
        this.tyreType = tyreType;
        return tyreType;
    }

    public boolean changeTyre(int  month) {
        if (month >= 10 || (month >= 1 && month <= 4)) {
            return tyreType = false;
        } else return tyreType = true;
    }

    public String printTyreType (boolean tyreType) {
     if (tyreType) {
         return printTyreType = "летняя резина";
     } else return printTyreType="зимняя резина";
         };

    class Key {
        private boolean KeyAccess;
        private boolean remoteStart;

        public Key(boolean keyAccess, boolean remoteStart) {
            KeyAccess = keyAccess;
            this.remoteStart = remoteStart;
        }
    }
    @Override
    public String toString() {
        return  brand+" "+ model+" "+ engineVolume+ " "+color + " "+productionCountry + " "+ productionYear+" "+
         transmission + " "+ bodyType +" "+ registerNumber+ " "+seats + " "+ printTyreType(this.tyreType);
    }

}

