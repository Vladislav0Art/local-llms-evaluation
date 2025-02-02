package net.e175.klaus.solarpositioning;

public class GeneratedTest {

    @Test
    public void estimateYearBefore500Test() {
        when(forDate.getYear()).thenReturn(400);
        double result = DeltaT.estimate(forDate);
        assertTrue(result >= 10583.6 && result <= 10950.1);
    }

    @Test
    public void estimateYearBetween500And1600Test() {
        when(forDate.getYear()).thenReturn(1500);
        double result = DeltaT.estimate(forDate);
        assertTrue(result >= 1574.2 && result <= 1619.8);
    }

}