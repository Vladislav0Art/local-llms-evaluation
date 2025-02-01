package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedEstimateYearLessThan1860Test {

    @Test
    public void estimateYearLessThan1860Test() {
        LocalDate forDate = LocalDate.of(1859, 6, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertEquals(13.72, deltaT, 0.1);
    }

}