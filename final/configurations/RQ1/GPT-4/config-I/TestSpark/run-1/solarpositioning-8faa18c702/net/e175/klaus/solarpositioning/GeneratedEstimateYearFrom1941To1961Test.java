package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimateYearFrom1941To1961Test {

    @Test
    public void estimateYearFrom1941To1961Test() {
        double result = DeltaT.estimate(LocalDate.of(1950, 3, 10));
        assertEquals(29.07, result, 0);
    }

}