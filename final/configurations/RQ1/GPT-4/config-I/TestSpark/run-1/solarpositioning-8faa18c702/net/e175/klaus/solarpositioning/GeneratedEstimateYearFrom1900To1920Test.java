package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimateYearFrom1900To1920Test {

    @Test
    public void estimateYearFrom1900To1920Test() {
        double result = DeltaT.estimate(LocalDate.of(1910, 9, 22));
        assertEquals(14.092025, result, 0.0001);
    }

}