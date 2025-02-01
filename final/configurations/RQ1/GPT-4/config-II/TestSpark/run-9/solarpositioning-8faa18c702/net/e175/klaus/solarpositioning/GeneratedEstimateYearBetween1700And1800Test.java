package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEstimateYearBetween1700And1800Test {

    @Test
    public void estimateYearBetween1700And1800Test() {
        assertEquals(14.571976, DeltaT.estimate(LocalDate.of(1750, 1, 1)), 0.001);
    }

}