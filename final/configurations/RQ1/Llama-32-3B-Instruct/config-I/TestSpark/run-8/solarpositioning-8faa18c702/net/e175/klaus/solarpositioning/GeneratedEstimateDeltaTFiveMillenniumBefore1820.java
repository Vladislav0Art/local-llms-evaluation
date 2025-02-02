package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateDeltaTFiveMillenniumBefore1820 {

    @Test
    public void estimateDeltaTFiveMillenniumBefore1820() {
        LocalDate forDate = LocalDate.of(1750, 1, 1);
        assertEquals(11.2, DeltaT.estimate(forDate), 0.1);
    }

}