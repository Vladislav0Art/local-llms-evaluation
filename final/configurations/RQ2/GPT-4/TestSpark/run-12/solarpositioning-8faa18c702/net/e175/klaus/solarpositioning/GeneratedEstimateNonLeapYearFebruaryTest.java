package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimateNonLeapYearFebruaryTest {

    @Test
    public void estimateNonLeapYearFebruaryTest() {
        LocalDate date = LocalDate.of(2021, 2, 28);
        double result = DeltaT.estimate(date);
        double expectedDelta = 71.27; // replace with expected delta t value for this date
        assertEquals(expectedDelta, result, 0.01);
    }

}