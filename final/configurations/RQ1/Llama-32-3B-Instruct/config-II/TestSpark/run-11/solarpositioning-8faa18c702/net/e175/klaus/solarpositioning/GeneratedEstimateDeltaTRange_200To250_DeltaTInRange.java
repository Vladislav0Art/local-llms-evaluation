package net.e175.klaus.solarpositioning;

public class GeneratedEstimateDeltaTRange_200To250_DeltaTInRange {

    @Test
    public void estimateDeltaTRange_200To250_DeltaTInRange() {
        LocalDate forDate = LocalDate.of(200, 1, 1);
        double expectedValue = DeltaT.estimate(forDate);
        assertTrue(Math.abs(DeltaT.estimate(forDate) - 29.07) < 0.00001);
    }

}