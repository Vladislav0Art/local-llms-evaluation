package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedEstimateYearLessThanNegative500Test {

    @Test
    public void estimateYearLessThanNegative500Test() {
        LocalDate forDate = LocalDate.of(-501, 6, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertTrue(deltaT < 0);
    }

}