package Date;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        String str = (day < 10) ? "0" + day : String.valueOf(day);
        str += "/" + ((month < 10) ? "0" + month : String.valueOf(month));
        str += "/" + year;

//        String score = (day > 90) ? "A" :
//                (day > 80) ? "B" :
//                        (day > 70) ? "C" :
//                                (day > 60) ? "D" : "F";
        return str;
    }
}
