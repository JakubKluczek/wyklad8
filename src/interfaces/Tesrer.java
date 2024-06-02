package interfaces;

import interfaces.Employee;

public class Tesrer implements Employee {

    private String firstName;
    private String lastName;
    private String pesel;
    private String address;
    private int numOfBugs;

    public Tesrer(String firstName, String lastName, String pesel, String address) {
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
        return numOfBugs*500;
    }
}
