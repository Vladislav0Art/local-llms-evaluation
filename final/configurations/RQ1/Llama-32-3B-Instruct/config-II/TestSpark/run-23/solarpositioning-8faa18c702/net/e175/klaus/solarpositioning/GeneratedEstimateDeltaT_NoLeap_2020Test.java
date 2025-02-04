package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedEstimateDeltaT_NoLeap_2020Test {

    @Test
    public void estimateDeltaT_NoLeap_2020Test() {
        LocalDate forDate = LocalDate.of(2020, 1, 1);
        assertEquals(16.3456, DeltaT.estimate(forDate), 0.0001);
    }

}