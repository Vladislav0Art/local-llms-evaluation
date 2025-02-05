package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateTestForLeapYear {

    @Test
    public void EstimateTestForLeapYear() {
        LocalDate date = LocalDate.of(2004, 1, 1);
        double result = DeltaT.estimate(date);
        assertEquals(64.30, result, 0.01);
    }

}