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
}

public class Main {
    public static double estimate(LocalDate date) {
        int year = date.getYear();
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? 366 : 365;
    }

    public static int decimalYear(LocalDate date) {
        return date.getYear() - 1901 + 1;
    }
}

public class GeneratedTest {

    @Test
    public void estimateDeltaTLegacyTest() {
        LocalDate forDate = createLocalDate(2000, 1, 1);
        double expected = DeltaT.estimate(forDate);
        assertEquals(63.86, expected, 0.01);
    }

    @Test
    public void estimateDeltaTEarlyTest() {
        LocalDate forDate = createLocalDate(1950, 1, 1);
        double expected = DeltaT.estimate(forDate);
        assertEquals(29.07, expected, 0.01);
    }

    @Test
    public void estimateDeltaTRemoteFutureTest() {
        LocalDate forDate = createLocalDate(2200, 1, 1);
        double expected = DeltaT.estimate(forDate);
        assertEquals(-20, expected, 0.01);
    }

}