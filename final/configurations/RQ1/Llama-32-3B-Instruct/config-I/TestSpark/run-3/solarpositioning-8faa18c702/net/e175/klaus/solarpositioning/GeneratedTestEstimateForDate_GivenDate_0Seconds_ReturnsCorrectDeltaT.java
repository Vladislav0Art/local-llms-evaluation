package net.e175.klaus.solarpositioning;

public class GeneratedTestEstimateForDate_GivenDate_0Seconds_ReturnsCorrectDeltaT {

    @Test
    public void testEstimateForDate_GivenDate_0Seconds_ReturnsCorrectDeltaT() {
        LocalDate date = LocalDate.of(2022, 6, 1);
        double deltaT = DeltaT.estimate(date);
        assertEquals(0, deltaT, 0.00001);
    }

}