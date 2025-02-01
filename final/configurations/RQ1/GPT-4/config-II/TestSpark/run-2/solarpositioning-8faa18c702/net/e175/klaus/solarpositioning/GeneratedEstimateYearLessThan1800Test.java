package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedEstimateYearLessThan1800Test {

    @Test
    public void estimateYearLessThan1800Test() {
        LocalDate forDate = LocalDate.of(1799, 6, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertEquals(8.83, deltaT, 0.1);
    }

}