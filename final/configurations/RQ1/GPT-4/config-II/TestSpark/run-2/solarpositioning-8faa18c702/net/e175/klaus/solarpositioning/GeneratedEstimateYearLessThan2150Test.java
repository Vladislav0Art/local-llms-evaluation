package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedEstimateYearLessThan2150Test {

    @Test
    public void estimateYearLessThan2150Test() {
        LocalDate forDate = LocalDate.of(2149, 6, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertTrue(deltaT < 0);
    }

}