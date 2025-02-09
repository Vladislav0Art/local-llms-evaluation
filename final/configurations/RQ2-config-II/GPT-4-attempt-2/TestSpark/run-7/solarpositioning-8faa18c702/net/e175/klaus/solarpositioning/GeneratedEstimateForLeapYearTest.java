package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateForLeapYearTest {

    @Test
    public void estimateForLeapYearTest() {
        LocalDate leapYearDate = LocalDate.of(2000, 1, 1);
        double result = DeltaT.estimate(leapYearDate);
        assertEquals(63.83, result, 0.001);
    }

}