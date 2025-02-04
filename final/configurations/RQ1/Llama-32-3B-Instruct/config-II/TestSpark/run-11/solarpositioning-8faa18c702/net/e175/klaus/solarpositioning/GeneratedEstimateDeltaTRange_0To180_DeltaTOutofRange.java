package net.e175.klaus.solarpositioning;

public class GeneratedEstimateDeltaTRange_0To180_DeltaTOutofRange {

    @Test
    public void estimateDeltaTRange_0To180_DeltaTOutofRange() {
        LocalDate forDate = LocalDate.of(1, 1, 1);
        double expectedValue = DeltaT.estimate(forDate);
        assertFalse(expectedValue < -20 || expectedValue > 63.86);
    }

}