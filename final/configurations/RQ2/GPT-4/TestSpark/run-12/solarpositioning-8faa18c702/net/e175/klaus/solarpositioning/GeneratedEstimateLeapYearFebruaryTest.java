package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimateLeapYearFebruaryTest {

    @Test
    public void estimateLeapYearFebruaryTest() {
        LocalDate date = LocalDate.of(2020, 2, 29);
        double result = DeltaT.estimate(date);
        double expectedDelta = 70.50; // replace with expected delta t value for this date
        assertEquals(expectedDelta, result, 0.01);
    }

}