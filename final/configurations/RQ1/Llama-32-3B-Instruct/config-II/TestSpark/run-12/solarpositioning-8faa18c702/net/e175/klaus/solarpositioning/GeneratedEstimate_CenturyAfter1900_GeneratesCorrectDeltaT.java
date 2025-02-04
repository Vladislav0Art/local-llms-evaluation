package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.util.Optional;

public class GeneratedEstimate_CenturyAfter1900_GeneratesCorrectDeltaT {

    @Test
    public void estimate_CenturyAfter1900_GeneratesCorrectDeltaT() {
        LocalDate forDate = LocalDate.of(2005, 1, 1);
        double result = DeltaT.estimate(forDate);
        assertEquals(63.86, result, 0.01);
    }

}