package net.e175.klaus.solarpositioning;

public class GeneratedEstimateDeltaTRange_1820To2000_DeltaTInRange {

    @Test
    public void estimateDeltaTRange_1820To2000_DeltaTInRange() {
        LocalDate forDate = LocalDate.of(1850, 1, 1);
        double expectedValue = DeltaT.estimate(forDate);
        assertTrue(Math.abs(DeltaT.estimate(forDate) - 13.72) < 0.00001);
    }

}