package transport;

import java.util.HashSet;
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
    public int hashCode() {
        return java.util.Objects.hash(getName());
    }

    @Override
    public boolean equals(Object obj) {
       if (this.getName() != ((Driver) obj).getName());

        return false;
    }


    @Override
    public String toString() {
        return getName();
    }
}