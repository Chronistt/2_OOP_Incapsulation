package transport;

public class Driver {
    final String name;
    final int experience;
    boolean licenseAvailable;

    public Driver(String name, int experience, boolean licenseAvailable) {
        this.name = name;
        this.experience = experience;
        this.licenseAvailable = licenseAvailable;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    public boolean isLicenseAvailable() {
        return licenseAvailable;
    }

    public void stopMove() {
        System.out.println("приехали");
    }

    public void startMove(){
        System.out.println("поехали");
    }
    public void refuel () {
        System.out.println("надо заправиться");
    }

}