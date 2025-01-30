package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedEstimateYearLessThan2005Test {

    @Test
    public void estimateYearLessThan2005Test() {
        LocalDate date = LocalDate.of(2000, 12, 31);
        double result = DeltaT.estimate(date);
        assertTrue(result > 63);
    }

}