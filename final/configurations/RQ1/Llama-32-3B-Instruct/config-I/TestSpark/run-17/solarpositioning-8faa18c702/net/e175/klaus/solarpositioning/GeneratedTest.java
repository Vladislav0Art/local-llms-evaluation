package net.e175.klaus.solarpositioning;

public class GeneratedTest {

    private int year;
    private int month;
    private int day;

    public LocalDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }
}

public class DayOfWeek {

    private static final int MONDAY = 1;
    private static final int TUESDAY = 2;
    private static final int WEDNESDAY = 3;
    private static final int THURSDAY = 4;
    private static final int FRIDAY = 5;
    private static final int SATURDAY = 6;
    private static final int SUNDAY = 0;

    public DayOfWeek(int day) {
        this.day = day;
    }

    public int getValue() {
        return this.day;
    }
}

public class Delta {

    private double delta;

    public Delta(double delta) {
        this.delta = delta;
    }

    public static void when(LocalDate date, Runnable action) {
        System.out.println("Date: " + date.getDay() + "/" + date.getMonth() + "/" + date.getYear());
        action.run();
    }
}

public class Mockito {

    public interface Matcher<T> {
    }

    public static <T> T when(T value, Matcher<T> matcher) {
        return null;
    }
}

public class GeneratedTest {

}