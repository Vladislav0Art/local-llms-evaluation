package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateDeltaTMidYearMidDateTest {

    @Test
    public void estimateDeltaTMidYearMidDateTest() {
        LocalDate forDate = LocalDate.of(1000, 6, 1);
        assertEquals(0.0, net.e175.klaus.solarpositioning.DeltaT.estimate(forDate), 0.01);
    }

}