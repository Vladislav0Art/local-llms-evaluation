package net.e175.klaus.solarpositioning;

public class GeneratedTestEstimate_GivenHistoricalDate_100Years_ReturnsCorrectDeltaT {

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