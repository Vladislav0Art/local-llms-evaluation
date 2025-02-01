package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateYearBefore1986Test {

    @Test
    public void estimateYearBefore1986Test() {
        LocalDate date = LocalDate.of(1980, 12, 10);
        double result = DeltaT.estimate(date);
        assertEquals(61.3255, result, 0.001);
    }

}