package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedEstimateYearLessThan1800Test {

    @Test
    public void estimateYearLessThan1800Test() {
        LocalDate date = LocalDate.of(1701, 2, 15);
        double result = DeltaT.estimate(date);
        assertTrue(result > 10);
    }

}