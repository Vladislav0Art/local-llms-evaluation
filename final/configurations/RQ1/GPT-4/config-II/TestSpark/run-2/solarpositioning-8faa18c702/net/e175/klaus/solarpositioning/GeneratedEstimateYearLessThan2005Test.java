package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedEstimateYearLessThan2005Test {

    @Test
    public void estimateYearLessThan2005Test() {
        LocalDate forDate = LocalDate.of(2004, 6, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertEquals(63.86, deltaT, 0.1);
    }

}