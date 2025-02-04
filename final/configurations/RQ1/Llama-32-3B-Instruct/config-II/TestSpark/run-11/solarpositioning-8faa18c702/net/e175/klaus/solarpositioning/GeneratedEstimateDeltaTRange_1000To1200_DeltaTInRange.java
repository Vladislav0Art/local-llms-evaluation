package net.e175.klaus.solarpositioning;

public class GeneratedEstimateDeltaTRange_1000To1200_DeltaTInRange {

    @Test
    public void estimateDeltaTRange_1000To1200_DeltaTInRange() {
        LocalDate forDate = LocalDate.of(1050, 1, 1);
        double expectedValue = DeltaT.estimate(forDate);
        assertTrue(Math.abs(DeltaT.estimate(forDate) - 1574.2) < 0.00001);
    }

}