package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.util.Optional;

public class GeneratedEstimate_CenturyBefore1900_GeneratesCorrectDeltaT {

    @Test
    public void estimate_CenturyBefore1900_GeneratesCorrectDeltaT() {
        LocalDate forDate = LocalDate.of(1800, 1, 1);
        double result = DeltaT.estimate(forDate);
        assertEquals(7.62, result, 0.01);
    }

}