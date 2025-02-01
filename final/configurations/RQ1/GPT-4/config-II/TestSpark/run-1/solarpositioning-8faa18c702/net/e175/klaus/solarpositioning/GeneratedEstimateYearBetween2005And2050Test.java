package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateYearBetween2005And2050Test {

    @Test
    public void estimateYearBetween2005And2050Test() {
        LocalDate date = LocalDate.of(2030, 1, 1);
        double result = DeltaT.estimate(date);
        assertEquals(77.2478, result, 0.005);
    }

}