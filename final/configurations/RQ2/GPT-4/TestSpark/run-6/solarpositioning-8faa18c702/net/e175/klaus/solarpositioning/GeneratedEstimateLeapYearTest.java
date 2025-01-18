package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.Assert;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateLeapYearTest {

    @Test
    public void estimateLeapYearTest() {
        LocalDate leapDate = LocalDate.of(2016, 2, 29);
        double result = DeltaT.estimate(leapDate);
        assertEquals(75.03277158191861, result, 0.001);
    }

}