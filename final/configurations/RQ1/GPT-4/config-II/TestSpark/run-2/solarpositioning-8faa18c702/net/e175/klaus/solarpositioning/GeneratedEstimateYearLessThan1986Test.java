package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedEstimateYearLessThan1986Test {

    @Test
    public void estimateYearLessThan1986Test() {
        LocalDate forDate = LocalDate.of(1985, 6, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertEquals(45.45, deltaT, 0.1);
    }

}