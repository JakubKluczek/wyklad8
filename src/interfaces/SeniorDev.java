package interfaces;

import java.util.ArrayList;

public class SeniorDev implements Employee {

    private String firstName;
    private String lastName;
    private String pesel;
    private String address;
    private ArrayList<String> technologies=new ArrayList<>();

    public SeniorDev(String firstName, String lastName, String pesel, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
        this.address = address;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String getPesel() {
        return pesel;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public double calculateSalary() {
        return technologies.size()*2000;
    }
}
