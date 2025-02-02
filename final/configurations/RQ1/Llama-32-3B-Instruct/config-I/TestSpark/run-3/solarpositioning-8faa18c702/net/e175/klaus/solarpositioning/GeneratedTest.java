package net.e175.klaus.solarpositioning;

public class GeneratedTest {

    @Test
    public void testEstimateForDate_GivenDate_0Seconds_ReturnsCorrectDeltaT() {
        LocalDate date = LocalDate.of(2022, 6, 1);
        double deltaT = DeltaT.estimate(date);
        assertEquals(0, deltaT, 0.00001);
    }

    @Test
    public void testEstimateForDate_HistoricalDate_100Years_ReturnsCorrectDeltaT() {
        LocalDate date = LocalDate.of(2012, 6, 1);
        double deltaT = DeltaT.estimate(date);
        assertEquals(-20, deltaT, 0.00001);
    }

    @Test
    public void testEstimateForDate_FutureDate_100Years_ReturnsCorrectDeltaT() {
        LocalDate date = LocalDate.of(2100, 6, 1);
        double deltaT = DeltaT.estimate(date);
        assertEquals(-80, deltaT, 0.00001);
    }

    @Test
    public void testDecimalYear_GivenDate_0Seconds_ReturnsCorrectDecimalYear() {
        LocalDate date = LocalDate.of(2022, 6, 1);
        double decimalYear = DeltaT.decimalYear(date);
        assertEquals(2022, (int) decimalYear, 0);
    }

    @Test
    public void testEstimate_GivenHistoricalDate_100Years_ReturnsCorrectDeltaT() {
        LocalDate date = LocalDate.of(2012, 6, 1);
        double deltaT = DeltaT.estimate(date);
        assertEquals(-20, deltaT, 0.00001);
    }
}

public class DeltaT {
    public static double estimate(LocalDate date) {
        // implementation
        return 0;
    }

    public static double decimalYear(LocalDate date) {
        // implementation
        return 0;
    }

}