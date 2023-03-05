package transport;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return experience == driver.experience && licenseAvailable == driver.licenseAvailable && name.equals(driver.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, experience, licenseAvailable);
    }

    @Override
    public String toString() {
        return getName();

    }
}