package net.e175.klaus.solarpositioning;

public class GeneratedEstimateDeltaTForPastYear_ReturnsZero {

    @Test
    public void estimateDeltaTForPastYear_ReturnsZero() {
        LocalDate forDate = LocalDate.of(-500, 1, 1);
        double result = net.e175.klaus.solarpositioning.DeltaT.estimate(forDate);
        assertEquals(0, result, 0.00001);
    }

}