package net.e175.klaus.solarpositioning;

public class GeneratedEstimateDeltaTLegacyTest {

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
    public void estimateDeltaTLegacyTest() {
        LocalDate forDate = createLocalDate(2000, 1, 1);
        double expected = DeltaT.estimate(forDate);
        assertEquals(63.86, expected, 0.01);
    }

}