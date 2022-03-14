package Time;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        if (0 <= hour && hour <= 24) {
            this.hour = hour;
        } else {
            System.out.println("Hour boundaries[0,23] exceeded.");
        }
        if (0 <= minute && minute <= 60) {
            this.minute = minute;
        } else {
            System.out.println("Minute boundaries[0,59] exceeded.");
        }
        if (0 <= second && second <= 60) {
            this.second = second;
        } else {
            System.out.println("Second boundaries[0,59] exceeded.");
        }
        if (second == 60) {
            minute += 1;
        }
        if (minute == 60) {
            hour += 1;
        }
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (0 <= hour && hour <= 24) {
            this.hour = hour % 24;
        } else {
            System.out.println("Hour boundaries[0,23] exceeded.");
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (0 <= minute && minute <= 60) {
            this.minute = minute % 60;
        } else {
            System.out.println("Minute boundaries[0,59] exceeded.");
        }
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (0 <= second && second <= 60) {
            this.second = second % 60;
        } else {
            System.out.println("Second boundaries[0,59] exceeded.");
        }
    }

    public void setTime(int hour, int minute, int second) {
        if (0 <= hour && hour <= 24) {
            this.hour = hour % 24;
        } else {
            System.out.println("Hour boundaries[0,23] exceeded.");
        }
        if (0 <= minute && minute <= 60) {
            this.minute = minute % 60;
        } else {
            System.out.println("Minute boundaries[0,59] exceeded.");
        }
        if (0 <= second && second <= 60) {
            this.second = second % 60;
        } else {
            System.out.println("Second boundaries[0,59] exceeded.");
        }

    }

    public String toString() {
        String message = (hour < 10) ? "0" + hour : String.valueOf(hour);
        message += ":" + ((minute < 10) ? "0" + minute : String.valueOf(minute));
        message += ":" + ((second < 10) ? "0" + second : String.valueOf(second));
        return message;
    }

    public Time nextSecond() {
        this.second++;
        if (second == 60) {
            minute += 1;
            second = 0;
        }
        if (minute == 60) {
            hour += 1;
            minute = 0;
        }
        if (hour == 24) {
            hour = 0;
        }
        return this;
    }

    public Time previousSecond() {
        this.second--;
        if (second < 0) {
            minute -= 1;
            second = 59;
        }
        if (minute < 0) {
            hour -= 1;
            minute = 59;
        }
        if (hour < 0) {
            hour = 23;
        }
        return this;
    }

}
