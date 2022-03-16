package Company;

import java.util.ArrayList;
import java.util.Calendar;

public class Manager extends Employee {
    private ArrayList<RegularEmployee> regularEmployees = new ArrayList();
    private double bonusBudget;

    public Manager(int id, String firstName, String lastName, String gender, Calendar birthDate,
                   String maritalStatus, String hasDriverLicense, double salary, Calendar hireDate,
                   Department department, double bonusBudget) {
        super(id, firstName, lastName, gender, birthDate, maritalStatus, hasDriverLicense,
                salary, hireDate, department);
        this.bonusBudget = bonusBudget;
    }

    public Manager(Employee employee, double bonusBudget) {
        super(employee.getId(), employee.getFirstName(), employee.getLastName(), employee.getGender(),
                employee.getBirthDate(), employee.getMaritalStatus(), employee.getHasDriverLicence(),
                employee.getSalary(), employee.getHireDate(), employee.getDepartment());
        this.bonusBudget = bonusBudget;
    }

    public void addEmployee(RegularEmployee employee) {
        regularEmployees.add(employee);
    }

    public void removeEmployee(RegularEmployee employee) {
        regularEmployees.remove(employee);
    }

    public void distributeBonusBudget() {
        double unit = findUnit(regularEmployees);
        double bonus;

        for (RegularEmployee e: regularEmployees
             ) {
            bonus = unit * e.getSalary() * e.getPerformanceScore();
            e.setBonus(bonus);
        }
    }

    private double findUnit(ArrayList<RegularEmployee> regularEmployees) {
        double sum = 0;

        for (RegularEmployee e : regularEmployees
        ) {
            sum += e.getSalary() * e.getPerformanceScore();
        }
        double unit = bonusBudget/sum;
        return unit;
    }

    public ArrayList<RegularEmployee> getRegularEmployees() {
        return regularEmployees;
    }

    public void setRegularEmployees(ArrayList<RegularEmployee> regularEmployees) {
        this.regularEmployees = regularEmployees;
    }

    public double getBonusBudget() {
        return bonusBudget;
    }

    public void setBonusBudget(double bonusBudget) {
        this.bonusBudget = bonusBudget;
    }

    @Override
    public String toString() {
        return "Manager{" + super.toString()+
                "regularEmployees=" + regularEmployees +
                ", bonusBudget=" + bonusBudget +
                '}';
    }
}
