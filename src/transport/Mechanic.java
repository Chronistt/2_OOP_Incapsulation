package transport;

import java.util.ArrayList;
import java.util.List;

public class Mechanic {
    private final String personName;
    private final String companyName;

    public Mechanic(String personName, String companyName) {
        this.personName = personName;
        this.companyName = companyName;
    }

    public String getPersonName() {
        return personName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void passCheck(){
        System.out.println(getPersonName() + " провел обслуживание");
    }
    public void repairCar(){
        System.out.println(getPersonName() + " отремонтировал машину");
    }

    @Override
    public String toString() {
        return getCompanyName() +" " + getPersonName();
    }
}
