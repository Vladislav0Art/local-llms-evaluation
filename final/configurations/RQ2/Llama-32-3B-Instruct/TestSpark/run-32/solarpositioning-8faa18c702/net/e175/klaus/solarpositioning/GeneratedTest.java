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

    public static LocalDate of(int year, int month, int day) {
        return new LocalDate(year, month, day);
    }
}

public class DeltaT {
    public Optional<Double> estimate(LocalDate date) {
        return Optional.empty();
    }

    public String formatDate(LocalDate date) {
        return "The date is: " + date.year + "-" + date.month + "-" + date.day;
    }
}

public class GeneratedTest {

}