package net.e175.klaus.solarpositioning;

public class GeneratedEstimateDeltaTRange_1500To1800_DeltaTInRange {

    @Test
    public void estimateDeltaTRange_1500To1800_DeltaTInRange() {
        LocalDate forDate = LocalDate.of(1750, 1, 1);
        double expectedValue = DeltaT.estimate(forDate);
        assertTrue(Math.abs(DeltaT.estimate(forDate) - 8.83) < 0.00001);
    }

}