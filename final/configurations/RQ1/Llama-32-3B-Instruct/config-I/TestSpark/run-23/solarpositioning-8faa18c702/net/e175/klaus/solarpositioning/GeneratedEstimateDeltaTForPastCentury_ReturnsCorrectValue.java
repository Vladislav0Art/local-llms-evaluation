package net.e175.klaus.solarpositioning;

public class GeneratedEstimateDeltaTForPastCentury_ReturnsCorrectValue {

    @Test
    public void estimateDeltaTForPastCentury_ReturnsCorrectValue() {
        LocalDate forDate = LocalDate.of(-500, 1, 1);
        double result = net.e175.klaus.solarpositioning.DeltaT.estimate(forDate);
        assertEquals(-20 + 32 * pow(4, 2), result, 0.00001);
    }

}