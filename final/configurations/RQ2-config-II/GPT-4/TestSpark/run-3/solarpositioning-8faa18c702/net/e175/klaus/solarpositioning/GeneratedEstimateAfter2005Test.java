package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateAfter2005Test {

    @Test
    public void EstimateAfter2005Test() {
        LocalDate date = LocalDate.of(2010, 1, 1);
        double result = DeltaT.estimate(date);
        assertEquals(66.32, result, 0.01);
    }

}