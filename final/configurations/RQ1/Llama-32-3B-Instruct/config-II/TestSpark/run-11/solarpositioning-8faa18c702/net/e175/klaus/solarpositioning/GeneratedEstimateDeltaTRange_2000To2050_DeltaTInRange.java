package net.e175.klaus.solarpositioning;

public class GeneratedEstimateDeltaTRange_2000To2050_DeltaTInRange {

    @Test
    public void estimateDeltaTRange_2000To2050_DeltaTInRange() {
        LocalDate forDate = LocalDate.of(2000, 1, 1);
        double expectedValue = DeltaT.estimate(forDate);
        assertTrue(Math.abs(DeltaT.estimate(forDate) - 63.86) < 0.00001);
    }

}