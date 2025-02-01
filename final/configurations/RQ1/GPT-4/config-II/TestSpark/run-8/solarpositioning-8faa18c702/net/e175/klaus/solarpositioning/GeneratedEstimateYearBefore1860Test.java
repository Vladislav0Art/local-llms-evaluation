package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateYearBefore1860Test {

    @Test
    public void estimateYearBefore1860Test() {
        LocalDate date = LocalDate.of(1850, 8, 10);
        double result = DeltaT.estimate(date);
        assertEquals(18.19597762, result, 0.001);
    }

}