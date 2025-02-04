package net.e175.klaus.solarpositioning;

public class GeneratedEstimateDeltaTRange_250To300_DeltaTOutofRange {

    @Test
    public void estimateDeltaTRange_250To300_DeltaTOutofRange() {
        LocalDate forDate = LocalDate.of(275, 1, 1);
        double expectedValue = DeltaT.estimate(forDate);
        assertFalse(expectedValue < -20 || expectedValue > 63.86);
    }

}