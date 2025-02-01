package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedEstimateYearLessThan500Test {

    @Test
    public void estimateYearLessThan500Test() {
        LocalDate forDate = LocalDate.of(499, 6, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertEquals(10583.6, deltaT, 0.1);
    }

}