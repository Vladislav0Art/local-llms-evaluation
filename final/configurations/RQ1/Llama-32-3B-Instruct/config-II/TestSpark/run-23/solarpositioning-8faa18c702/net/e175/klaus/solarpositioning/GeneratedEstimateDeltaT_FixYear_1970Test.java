package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedEstimateDeltaT_FixYear_1970Test {

    @Test
    public void estimateDeltaT_FixYear_1970Test() {
        LocalDate forDate = LocalDate.of(1970, 1, 1);
        assertEquals(24.106, DeltaT.estimate(forDate), 0.001);
    }

}