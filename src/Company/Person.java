package Company;

import java.util.Calendar;
import java.util.Objects;

public class Person {
    private int id;
    private String firstName;
    private String lastName;
    private byte gender;
    private java.util.Calendar birthDate;
    private byte maritalStatus;
    private boolean hasDriverLicence;

    public Person(int id, String firstName, String lastName, String gender,
                  Calendar birthDate, String maritalStatus, String hasDriverLicense) {
        setId(id);
        setFirstName(firstName);
        setLastName(lastName);
        setGender(gender);
        setBirthDate(birthDate);
        setMaritalStatus(maritalStatus);
        setHasDriverLicence(hasDriverLicense);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getGender() {
        if (gender == 1) {
            return "Woman";
        } else if (gender == 2) {
            return "Man";
        }
        return "Can't get gender";
    }

    public void setGender(String gender) {
        if (Objects.equals(gender, "Woman")) {
            this.gender = 1;
        } else if (Objects.equals(gender, "Man")) {
            this.gender = 2;
        } else {
            System.out.println("Invalid input. Please enter 'Woman' or 'Man'.");
        }
    }

    public Calendar getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Calendar birthDate) {
        this.birthDate = birthDate;
    }

    public String getMaritalStatus() {
        if (maritalStatus == 1) {
            return "Single";
        } else if (maritalStatus == 2) {
            return "Married";
        }
        return "Can't get marital status";
    }

    public void setMaritalStatus(String maritalStatus) {
        if (Objects.equals(maritalStatus, "Single")) {
            this.maritalStatus = 1;
        } else if (Objects.equals(maritalStatus, "Married")) {
            this.maritalStatus = 2;
        } else {
            System.out.println("Invalid input. Please enter 'Single' or 'Married'.");
        }
    }

    public String getHasDriverLicence() {
        if (hasDriverLicence) {
            return "Yes";
        } else {
            return "No";
        }
    }

    public void setHasDriverLicence(String hasDriverLicence) {
        if (Objects.equals(hasDriverLicence, "Yes")) {
            this.hasDriverLicence = true;
        } else if (Objects.equals(hasDriverLicence, "No")) {
            this.hasDriverLicence = false;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + getGender() +
                ", birthDate=" + birthDate +
                ", maritalStatus=" + getMaritalStatus() +
                ", hasDriverLicence=" + getHasDriverLicence() +
                '}';
    }

    }