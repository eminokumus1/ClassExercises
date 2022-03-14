package Course;

import java.util.Objects;

public class Course {
    private String courseName;
    private String[] students;
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void addStudent(String student) {
        // temp arrayini student arrayine eşitleyerek onun referansını veriyorum. Student arrayini new array yaparak başka referansa atıyorum.
        if(students == null){
            addFirstStudent(student);
        }else{
            addOtherStudents(student);
        }
        numberOfStudents++;
    }

    private void addOtherStudents(String student) {
        String[] temp = students;
        students = new String[temp.length + 1];
        System.arraycopy(temp, 0, students, 0, temp.length);
        students[students.length - 1] = student;
    }

    private void addFirstStudent(String student) {
        students = new String[1];
        students[0] = student;
    }

    public void dropStudent(String student) {
        int index =0;
        for (String s : students) {
            if (Objects.equals(s, student)) {
                index++;
                break;
            }
            index++;
        }
        String[] temp = students;
        students = new String[temp.length-1];
        if (index >= 0) System.arraycopy(temp, 0, students, 0, index);
        if (temp.length - (index + 1) >= 0)
            System.arraycopy(temp, index + 1, students, index, temp.length - (index + 1));
        numberOfStudents--;
    }
    public String[] getStudents(){
        return students;
    }
    public int getNumberOfStudents(){
        return students.length;
    }
}
