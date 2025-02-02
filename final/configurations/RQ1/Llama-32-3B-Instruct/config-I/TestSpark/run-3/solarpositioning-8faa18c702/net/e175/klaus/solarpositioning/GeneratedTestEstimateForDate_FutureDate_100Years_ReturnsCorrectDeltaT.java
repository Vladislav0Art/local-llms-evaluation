package net.e175.klaus.solarpositioning;

public class GeneratedTestEstimateForDate_FutureDate_100Years_ReturnsCorrectDeltaT {

    @Test
    public void testEstimateForDate_FutureDate_100Years_ReturnsCorrectDeltaT() {
        LocalDate date = LocalDate.of(2100, 6, 1);
        double deltaT = DeltaT.estimate(date);
        assertEquals(-80, deltaT, 0.00001);
    }

}