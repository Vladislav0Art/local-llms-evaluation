package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedEstimateDeltaT_WithLeap_2012Test {

    @Test
    public void estimateDeltaT_WithLeap_2012Test() {
        LocalDate forDate = LocalDate.of(2012, 1, 1);
        assertEquals(15.4457, DeltaT.estimate(forDate), 0.001);
    }

}