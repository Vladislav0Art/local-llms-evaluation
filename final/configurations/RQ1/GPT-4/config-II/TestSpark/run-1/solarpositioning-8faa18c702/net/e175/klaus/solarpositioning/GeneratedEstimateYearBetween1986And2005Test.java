package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateYearBetween1986And2005Test {

    @Test
    public void estimateYearBetween1986And2005Test() {
        LocalDate date = LocalDate.of(2000, 1, 1);
        double result = DeltaT.estimate(date);
        assertEquals(63.86, result, 0.005);
    }

}