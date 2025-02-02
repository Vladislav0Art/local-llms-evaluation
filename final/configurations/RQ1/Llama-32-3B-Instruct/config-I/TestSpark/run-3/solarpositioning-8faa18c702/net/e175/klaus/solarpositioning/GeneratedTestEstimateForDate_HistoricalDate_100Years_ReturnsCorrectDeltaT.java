package net.e175.klaus.solarpositioning;

public class GeneratedTestEstimateForDate_HistoricalDate_100Years_ReturnsCorrectDeltaT {

    @Test
    public void testEstimateForDate_HistoricalDate_100Years_ReturnsCorrectDeltaT() {
        LocalDate date = LocalDate.of(2012, 6, 1);
        double deltaT = DeltaT.estimate(date);
        assertEquals(-20, deltaT, 0.00001);
    }

}