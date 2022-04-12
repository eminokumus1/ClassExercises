package Company;

import java.util.Calendar;
import java.util.Objects;

public class Project {
    private String projectName;
    private java.util.Calendar startDate;
    private boolean state;

    public Project(String pName, Calendar startDate, String state) {
        setProjectName(pName);
        setStartDate(startDate);
        setState(state);
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Calendar getStartDate() {
        return startDate;
    }

    public void setStartDate(Calendar startDate) {
        this.startDate = startDate;
    }

    public String getState() {
        if (state) {
            return "Open";
        } else {
            return "False";
        }
    }

    public void setState(String state) {
        if (Objects.equals(state, "Open")) {
            this.state = true;
        } else if (Objects.equals(state, "Close")) {
            this.state = false;
        } else {
            System.out.println("Invalid input. Please enter 'Open'' or 'Close'.");
        }
    }
    public void close(){
        if (state){
            state = false;
        }
    }

    public String toString() {
        return "Project[name=" + projectName + ",start date:" + startDate + ",state" + getState() + "]";
    }
}
