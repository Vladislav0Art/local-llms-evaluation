package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedEstimateYearLessThan1600Test {

    @Test
    public void estimateYearLessThan1600Test() {
        LocalDate forDate = LocalDate.of(1599, 6, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertEquals(14676.4, deltaT, 0.1);
    }

}