package net.e175.klaus.solarpositioning;

public class GeneratedEstimateDeltaTForYearOutsideEpoch_ReturnsCorrectValue {

    @Test
    public void estimateDeltaTForYearOutsideEpoch_ReturnsCorrectValue() {
        LocalDate forDate = LocalDate.of(2051, 1, 1);
        double result = net.e175.klaus.solarpositioning.DeltaT.estimate(forDate);
        assertEquals(-20 + 32 * pow(((2051 - 1820) / 100), 2), result, 0.00001);
    }

}