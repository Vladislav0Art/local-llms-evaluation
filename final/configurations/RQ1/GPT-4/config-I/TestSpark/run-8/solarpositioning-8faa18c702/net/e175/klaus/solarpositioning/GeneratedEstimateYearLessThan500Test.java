package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedEstimateYearLessThan500Test {

    @Test
    public void estimateYearLessThan500Test() {
        LocalDate date = LocalDate.of(499, 12, 31);
        double result = DeltaT.estimate(date);
        assertTrue(result > 10500);
    }

}