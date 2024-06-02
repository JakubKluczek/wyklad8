package przyklad1;

import java.util.ArrayList;

public class Student {
    public static ArrayList<EctsScoreCalculationStrategy> strategies=new ArrayList<>();


    private String firstName;
    private String lastName;
    private String address;
    private String pesel;
    private String studia;
    private int signYear;
    private ArrayList<Double> grades=new ArrayList<>();
    private EctsScoreCalculationStrategy calculationStrategy;

    public Student(String firstName, String lastName, String address, String pesel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.pesel = pesel;
    }

    public double calculateEctsScore() {

        for(EctsScoreCalculationStrategy s : strategies){
            if(s.canBeApplied(studia, signYear)){
                return s.calculateEctsScore(grades);
            }
        }
        return -1;
    }


    public void addGrade(double grade){
        this.grades.add(grade);
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }
}
