package net.e175.klaus.solarpositioning;

public class GeneratedEstimateDeltaTForYearWithinEpoch_ReturnsCorrectValue {

    @Test
    public void estimateDeltaTForYearWithinEpoch_ReturnsCorrectValue() {
        LocalDate forDate = LocalDate.of(2000, 1, 1);
        double result = net.e175.klaus.solarpositioning.DeltaT.estimate(forDate);
        assertEquals(-20 + 32 * pow(80, 2), result, 0.00001);
    }

}