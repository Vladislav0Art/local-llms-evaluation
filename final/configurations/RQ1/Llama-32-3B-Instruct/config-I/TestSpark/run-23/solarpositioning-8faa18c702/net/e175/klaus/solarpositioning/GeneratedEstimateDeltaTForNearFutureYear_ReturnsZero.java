package net.e175.klaus.solarpositioning;

public class GeneratedEstimateDeltaTForNearFutureYear_ReturnsZero {

    @Test
    public void estimateDeltaTForNearFutureYear_ReturnsZero() {
        LocalDate forDate = LocalDate.of(2150, 1, 1);
        double result = net.e175.klaus.solarpositioning.DeltaT.estimate(forDate);
        assertEquals(0, result, 0.00001);
    }

}