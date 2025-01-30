package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimateYearFrom2005To2050Test {

    @Test
    public void estimateYearFrom2005To2050Test() {
        double result = DeltaT.estimate(LocalDate.of(2020, 5, 29));
        assertEquals(71.72133, result, 0.0001);
    }

}