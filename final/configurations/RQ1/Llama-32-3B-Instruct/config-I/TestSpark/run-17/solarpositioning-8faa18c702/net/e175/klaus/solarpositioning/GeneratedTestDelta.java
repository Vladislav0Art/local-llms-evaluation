package net.e175.klaus.solarpositioning;

public class GeneratedTestDelta {

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

    public static DayOfWeek of(int day) {
        switch (day) {
            case MONDAY:
                return new DayOfWeek(MONDAY);
            case TUESDAY:
                return new DayOfWeek(TUESDAY);
            case WEDNESDAY:
                return new DayOfWeek(WEDNESDAY);
            case THURSDAY:
                return new DayOfWeek(THURSDAY);
            case FRIDAY:
                return new DayOfWeek(FRIDAY);
            case SATURDAY:
                return new DayOfWeek(SATURDAY);
            case SUNDAY:
                return new DayOfWeek(SUNDAY);
            default:
                throw new IllegalArgumentException("Invalid day of week: " + day);
        }
    }

    public int getValue() {
        return this;
    }

    private DayOfWeek(int value) {
        this.value = value;
    }

    private int value;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DayOfWeek that = (DayOfWeek) o;
        return value == that.value;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(value);
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

    private static final <T> T when(T value, Matcher<T> matcher) {
        return null;
    }

    public interface Matcher<T> {
    }
}

public class GeneratedTest {

    @Test
    public void testDelta() {
        LocalDate date = new LocalDate(2022, 1, 15);
        Delta.when(date, d -> System.out.println("This is a test"));
    }

}