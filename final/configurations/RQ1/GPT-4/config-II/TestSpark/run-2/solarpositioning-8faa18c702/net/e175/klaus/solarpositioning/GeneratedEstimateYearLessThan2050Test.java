package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedEstimateYearLessThan2050Test {

    @Test
    public void estimateYearLessThan2050Test() {
        LocalDate forDate = LocalDate.of(2049, 6, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertEquals(62.92, deltaT, 0.1);
    }

}