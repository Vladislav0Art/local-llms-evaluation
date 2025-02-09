package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedInvalidDateTest {

    @Test
    public void invalidDateTest() {
        assertThrows(IllegalArgumentException.class, () -> DateUtils.dayOfMonth(9999, 12));
    }

    public static class DateUtils {

        public static LocalDate dayOfMonth(int year, int month) throws IllegalArgumentException {
            if (year < 1 || year > 9999) {
                throw new IllegalArgumentException("Invalid year");
            }
            if (month < 1 || month > 12) {
                throw new IllegalArgumentException("Invalid month");
            }
            return LocalDate.of(year, month, 31);
        }

        public static String dateAsString(LocalDate date) {
            return date.toString();
        }
    }
}

public class LocalDate {

    private final int year;
    private final int month;
    private final int dayOfMonth;

    public LocalDate(int year, int month, int dayOfMonth) {
        this.year = year;
        this.month = month;
        this.dayOfMonth = dayOfMonth;
    }

    @Override
    public String toString() {
        return "Date{" +
                "year=" + year +
                ", month=" + month +
                ", dayOfMonth=" + dayOfMonth +
                '}';
    }

}