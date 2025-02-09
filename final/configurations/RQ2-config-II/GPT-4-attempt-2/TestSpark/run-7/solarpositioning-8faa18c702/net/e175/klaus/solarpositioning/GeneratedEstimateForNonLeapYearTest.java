package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateForNonLeapYearTest {

    @Test
    public void estimateForNonLeapYearTest() {
        LocalDate nonLeapYearDate = LocalDate.of(1999, 1, 1);
        double result = DeltaT.estimate(nonLeapYearDate);
        assertEquals(63.83, result, 0.001);
    }

}