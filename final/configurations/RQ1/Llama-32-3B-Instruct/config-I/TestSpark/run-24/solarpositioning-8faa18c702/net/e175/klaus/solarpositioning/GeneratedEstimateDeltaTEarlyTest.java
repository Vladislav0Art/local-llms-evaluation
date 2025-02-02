package net.e175.klaus.solarpositioning;

public class GeneratedEstimateDeltaTEarlyTest {

    public static double estimate(LocalDate date) {
        // implementation
    }

    public static int decimalYear(LocalDate date) {
        // implementation
    }
}

public class DeltaTTest {

    public LocalDate createLocalDate(int year, int month, int day) {
        return LocalDate.of(year, month, day);
    }

    @Test
    public void estimateDeltaTEarlyTest() {
        LocalDate forDate = createLocalDate(1950, 1, 1);
        double expected = DeltaT.estimate(forDate);
        assertEquals(29.07, expected, 0.01);
    }

}