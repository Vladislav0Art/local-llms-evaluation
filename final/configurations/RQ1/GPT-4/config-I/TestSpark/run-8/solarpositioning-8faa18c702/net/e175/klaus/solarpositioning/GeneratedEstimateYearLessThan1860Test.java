package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedEstimateYearLessThan1860Test {

    @Test
    public void estimateYearLessThan1860Test() {
        LocalDate date = LocalDate.of(1850, 8, 20);
        double result = DeltaT.estimate(date);
        assertTrue(result > 20);
    }

}