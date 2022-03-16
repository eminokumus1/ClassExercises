package Company;

import java.util.ArrayList;
import java.util.Calendar;

public class Developer extends RegularEmployee{
    private ArrayList<Project> projects = new ArrayList<>();
    private int numberOfDevelopers;

    public Developer(int id, String firstName, String lastName, String gender, Calendar birthDate,
                     String maritalStatus, String hasDriverLicense, double salary, Calendar hireDate,
                     Department department, double performanceScore,ArrayList<Project> projects){
        super(id, firstName, lastName, gender, birthDate, maritalStatus, hasDriverLicense, salary,
                hireDate, department, performanceScore);
        this.projects = projects;
        numberOfDevelopers++;
    }
    public Developer(RegularEmployee re, ArrayList<Project> projects){
        super(re.getId(), re.getFirstName(), re.getLastName(), re.getGender(), re.getBirthDate(),
                re.getMaritalStatus(), re.getHasDriverLicence(), re.getSalary(), re.getHireDate(),
                re.getDepartment(), re.getPerformanceScore());
        this.projects = projects;
        numberOfDevelopers++;
    }
    public boolean addProject(Project p){
        return !projects.contains(p);
    }
    public boolean removeProject(Project p){
        return projects.contains(p);
    }

    public ArrayList<Project> getProjects() {
        return projects;
    }

    public void setProjects(ArrayList<Project> projects) {
        this.projects = projects;
    }

    public int getNumberOfDevelopers() {
        return numberOfDevelopers;
    }

    public void setNumberOfDevelopers(int numberOfDevelopers) {
        this.numberOfDevelopers = numberOfDevelopers;
    }

    @Override
    public String toString() {
        return "Developer{" + super.toString()+
                "projects=" + projects +
                ", numberOfDevelopers=" + numberOfDevelopers +
                '}';
    }
}
