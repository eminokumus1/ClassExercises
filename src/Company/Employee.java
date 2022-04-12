package Company;

import java.util.Calendar;

public class Employee extends Person {
    private double salary;
    private java.util.Calendar hireDate;
    private Department department;
    private int numberOfEmployees;

    public Employee(int id, String firstName, String lastName, String gender, Calendar birthDate, String maritalStatus,
                    String hasDriverLicense, double salary, Calendar hireDate, Department department) {
        super(id, firstName, lastName, gender, birthDate, maritalStatus, hasDriverLicense);
        this.salary = salary;
        this.hireDate = hireDate;
        this.department = department;
        numberOfEmployees++;
    }

    public Employee(Person person, double salary, Calendar hireDate, Department department) {
        super(person.getId(), person.getFirstName(), person.getLastName(), person.getGender(), person.getBirthDate(),
                person.getMaritalStatus(), person.getHasDriverLicence());
        this.salary = salary;
        this.hireDate = hireDate;
        this.department = department;
        numberOfEmployees++;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Calendar getHireDate() {
        return hireDate;
    }

    public void setHireDate(Calendar hireDate) {
        this.hireDate = hireDate;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public double raiseSalary(double percent) {
        if (percent >= 0 && percent <= 1) {
            salary += salary * percent;
        } else {
            System.out.println("Invalid input. Please enter a number between 0 and 1.");
        }
        return salary;
    }

    public double raiseSalary(int amount) {
        return salary + amount;
    }

    @Override
    public String toString() {
        return "Person Info [id=" + super.getId() +
                ", firstName=" + super.getFirstName() +
                ", lastName=" + super.getLastName() +
                ", gender=" + super.getGender() + "]" + "\n" +
                "Employee Info [salary=" + salary +
                ", hireDate=" + hireDate + "]";

    }
}
