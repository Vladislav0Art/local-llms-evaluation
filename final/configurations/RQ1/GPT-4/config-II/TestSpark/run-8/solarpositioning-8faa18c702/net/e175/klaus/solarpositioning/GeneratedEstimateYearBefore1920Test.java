package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateYearBefore1920Test {

    @Test
    public void estimateYearBefore1920Test() {
        LocalDate date = LocalDate.of(1910, 10, 30);
        double result = DeltaT.estimate(date);
        assertEquals(6.488209248, result, 0.001);
    }

}