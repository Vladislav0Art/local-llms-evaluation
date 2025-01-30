package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimateYearFrom1920To1941Test {

    @Test
    public void estimateYearFrom1920To1941Test() {
        double result = DeltaT.estimate(LocalDate.of(1930, 12, 19));
        assertEquals(23.465905, result, 0.0001);
    }

}